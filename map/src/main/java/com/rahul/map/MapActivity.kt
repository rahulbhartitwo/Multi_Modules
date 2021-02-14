package com.rahul.map

import android.annotation.SuppressLint
import android.graphics.Color
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Interpolator
import android.view.animation.LinearInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.gms.maps.model.Polyline
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.gson.Gson
import com.rahul.commonlibrary.showLog
import com.rahul.map.databinding.ActivityMapBinding
import com.rahul.map.utils.*
import com.rahul.map.utils.MyLocation.initLocation


class MapActivity : AppCompatActivity(), OnMapReadyCallback, MyLocation.OnLocation {
    var TAG = "MapActivity"
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    private var polyLineList: MutableList<LatLng>? = null
    private var polylineOptions: PolylineOptions? = null
    private var blackPolylineOptions: PolylineOptions? = null
    private var blackPolyline: Polyline? = null
    private var greyPolyLine: Polyline? = null
    private var mMap: GoogleMap? = null
    var mCustomMarkerView: View? = null
    lateinit var binding: ActivityMapBinding

    lateinit var originMarker: Marker
    lateinit var destinationMarker: Marker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        init()
        listener()
//        islocation()
        initLocation(this)
    }

    private fun init() {
        polyLineList = mutableListOf()
        bottomSheetBehavior = BottomSheetBehavior.from(binding.inc.bottomSheet)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.mymap) as SupportMapFragment
        mapFragment.getMapAsync(this)

        mCustomMarkerView =
            (getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(
                R.layout.view_custom_marker,
                null
            )
    }

    private fun listener() {
        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // handle onSlide
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                    }//Toast.makeText(this@MapActivity, "STATE_COLLAPSED", Toast.LENGTH_SHORT).show()
                    BottomSheetBehavior.STATE_EXPANDED -> {
                    }//Toast.makeText(this@MapActivity, "STATE_EXPANDED", Toast.LENGTH_SHORT).show()
                    BottomSheetBehavior.STATE_DRAGGING -> {
                    }//Toast.makeText(this@MapActivity, "STATE_DRAGGING", Toast.LENGTH_SHORT).show()
                    BottomSheetBehavior.STATE_SETTLING -> {
                    } //Toast.makeText(this@MapActivity, "STATE_SETTLING", Toast.LENGTH_SHORT).show()
                    BottomSheetBehavior.STATE_HIDDEN -> {
                    }//Toast.makeText(this@MapActivity, "STATE_HIDDEN", Toast.LENGTH_SHORT).show()
                    else -> {
                    }//Toast.makeText(this@MapActivity, "OTHER_STATE", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    @SuppressLint("SetTextI18n", "MissingPermission")
    override fun onMapReady(googleMap: GoogleMap?) {
        mMap = googleMap
        val style = MapStyleOptions.loadRawResourceStyle(this, R.raw.map_style_new)
        mMap!!.setMapStyle(style)
//        mMap!!.uiSettings.apply {
//            isZoomControlsEnabled = true
//            isZoomGesturesEnabled = true
//            isCompassEnabled = true
//        }
//
//        mMap!!.isMyLocationEnabled = true

        val result = Gson().fromJson(Constant.mapJson, MapEntity::class.java)
        val routeList = result.routes
        for (route in routeList) {
            binding.inc.tvTitle.text =
                "${ExtensionFunction.millimeterToKm(route.legs[0].distance.value)}  Dist : ${route.legs[0].distance.text}"
            val polyLine = route.overview_polyline.points
            polyLineList = DirectionsUtils.decodePoly(polyLine) as MutableList<LatLng>
        }
        mMap!!.getUiSettings().isMyLocationButtonEnabled = false
        Handler().postDelayed({
            drawPolyLineAndAnimateCar(
                LatLng(28.535517, 77.391029), LatLng(
                    27.176670,
                    78.008072
                )
            )
        }, 2000)
    }

    private fun drawPolyLineAndAnimateCar(currentLatLng: LatLng, dropLatLng: LatLng) {
        val builder = LatLngBounds.Builder()
        for (latLng in polyLineList!!) {
            builder.include(latLng)
        }
        val bounds = builder.build()
        val mCameraUpdate = CameraUpdateFactory.newLatLngBounds(bounds, 102)
        mMap!!.animateCamera(mCameraUpdate)

        polylineOptions = PolylineOptions()
        polylineOptions!!.color(Color.BLACK)
        polylineOptions!!.width(5f)
        polylineOptions!!.startCap(SquareCap())
        polylineOptions!!.endCap(SquareCap())
        polylineOptions!!.jointType(JointType.ROUND)
        polylineOptions!!.geodesic(true)
        polylineOptions!!.addAll(polyLineList)
        greyPolyLine = mMap!!.addPolyline(polylineOptions)

        blackPolylineOptions = PolylineOptions()
        blackPolylineOptions!!.width(5f)
        blackPolylineOptions!!.color(Color.BLACK)
        blackPolylineOptions!!.startCap(SquareCap())
        blackPolylineOptions!!.endCap(SquareCap())
        blackPolylineOptions!!.geodesic(true)
        blackPolylineOptions!!.jointType(JointType.ROUND)
        blackPolyline = mMap!!.addPolyline(blackPolylineOptions)

        originMarker = addOriginDestinationMarkerAndGet(polyLineList!![0])
        originMarker.setAnchor(0.5f, 0.5f)
        destinationMarker =
            addOriginDestinationMarkerAndGet(polyLineList!![polyLineList!!.size - 1])
        destinationMarker.setAnchor(0.15f, 0.15f)

//        var handler = Handler();
//        handler.postDelayed(Runnable() {
//            @Override
//            fun run() {
//                if (greyPolyLine != null) {
//                    greyPolyLine!!.remove();
//                }
//                if (blackPolyline != null) {
//                    blackPolyline!!.remove();
//                }

//                if (greyPolyLine != null) {
//                    if (greyPolyLine!!.isVisible()) {
//                        greyPolyLine!!.remove();
//                        blackPolyline = mMap!!.addPolyline(blackPolylineOptions);
//                    } else {
//                        blackPolyline?.remove();
//                        greyPolyLine = mMap?.addPolyline(polylineOptions);
//                    }
//                }
//            }
//        }, 4000);
    }

    private fun addOriginDestinationMarkerAndGet(latLng: LatLng): Marker {
        val bitmapDescriptor =
            BitmapDescriptorFactory.fromBitmap(ExtensionFunction.getOriginDestinationMarkerBitmap())
        return mMap!!.addMarker(
            MarkerOptions().position(latLng).flat(true).icon(bitmapDescriptor)
        )
    }

    private fun addCarMarkerAndGet(latLng: LatLng): Marker {
        val bitmapDescriptor = BitmapDescriptorFactory.fromBitmap(MapUtils.getCarBitmap(this))
        return mMap!!.addMarker(
            MarkerOptions().position(latLng).flat(true).icon(bitmapDescriptor)
        )
    }

    private fun animateCamera(latLng: LatLng) {
        val cameraPosition = CameraPosition.Builder().target(latLng).zoom(15.5f).build()
        mMap!!.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
    }

    @SuppressLint("SetTextI18n")
    override fun onLocation(ongoingLocation: Location) {
        binding.inc.tvSubtitle.text = "${ongoingLocation.latitude}, ${ongoingLocation.longitude}"
        updateCarLocation(LatLng(ongoingLocation.latitude, ongoingLocation.longitude))
        showLog(TAG, "onLocation => ${ongoingLocation.latitude} lng => ${ongoingLocation.longitude}")
    }

    lateinit var movingCabMarker: Marker
    private var previousLatLng: LatLng? = null
    private var currentLatLng: LatLng? = null

    private fun updateCarLocation(ongoingLatlng: LatLng) {
        if (!this::movingCabMarker.isInitialized) {
            movingCabMarker = addCarMarkerAndGet(ongoingLatlng)
        }
        if (previousLatLng == null) {
            currentLatLng = ongoingLatlng
            previousLatLng = currentLatLng
            movingCabMarker.position = currentLatLng
            movingCabMarker.setAnchor(0.5f, 0.5f)
            animateCamera(currentLatLng!!)
        } else {
            Log.d(TAG, "$previousLatLng is not null")
            previousLatLng = currentLatLng
            currentLatLng = ongoingLatlng
            val valueAnimator = AnimationUtils.carAnimator()
            valueAnimator.addUpdateListener { va ->
                if (currentLatLng != null && previousLatLng != null) {
                    val multiplier = va.animatedFraction
                    Log.d(TAG, "multiplier => $multiplier")

                    val nextLocation = LatLng(
                        multiplier * currentLatLng!!.latitude + (1 - multiplier) * previousLatLng!!.latitude,
                        multiplier * currentLatLng!!.longitude + (1 - multiplier) * previousLatLng!!.longitude
                    )

                    movingCabMarker.position = nextLocation
                    val rotation = MapUtils.getRotation(previousLatLng!!, nextLocation)
                    if (!rotation.isNaN()) {
                        movingCabMarker.rotation = rotation
                    }
                    movingCabMarker.setAnchor(0.5f, 0.5f)
                    animateCamera(nextLocation)
                }
            }
            valueAnimator.start()
        }
    }
}