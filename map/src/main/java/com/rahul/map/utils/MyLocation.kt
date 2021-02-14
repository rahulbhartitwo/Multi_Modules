package com.rahul.map.utils

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.IntentSender
import android.content.pm.PackageManager
import android.location.Location
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.gms.tasks.OnFailureListener
import com.rahul.commonlibrary.showLog
import com.rahul.commonlibrary.showToastLong

object MyLocation : AppCompatActivity() {

    var TAG = "MyLocation"
    var onLocation: OnLocation? = null

    private val REQUEST_CHECK_SETTINGS = 1219
    private val REQUEST_GRANT_PERMISSION = 1301

    var mFusedLocationClient: FusedLocationProviderClient? = null
    var locationCallback: LocationCallback? = null
    lateinit var locationRequest: LocationRequest
    private var currentLocation: Location? = null

    lateinit var context: Context
    lateinit var activity: Activity


    fun initLocation(context: Context) {
        onLocation = context as OnLocation
        this.context = context
        this.activity = context as Activity
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(activity)
        createLocationRequest()
        settingsCheck()

        if (ActivityCompat.checkSelfPermission(
                activity,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                activity,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_GRANT_PERMISSION
            )
            return
        }
        if (locationCallback == null)
            buildLocationCallback()

        if (currentLocation == null)
            mFusedLocationClient!!.requestLocationUpdates(
                locationRequest,
                locationCallback,
                Looper.myLooper()
            )

    }

    fun createLocationRequest() {
        showLog(TAG, "createLocationRequest")
        locationRequest = LocationRequest.create()
        locationRequest.interval = 10000
        locationRequest.fastestInterval = 5000
        locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
    }

    // Check for location settings
    private fun settingsCheck() {
        showLog(TAG, "settingsCheck")

        val builder = LocationSettingsRequest.Builder().addLocationRequest(locationRequest)
        val client = LocationServices.getSettingsClient(activity)
        val task = client.checkLocationSettings(builder.build())
        task.addOnSuccessListener(activity) { locationSettingsResponse: LocationSettingsResponse? ->
            // All location settings are satisfied. The client can initialize
            // location requests here.
            showLog(TAG, "onSuccess: settingsCheck")
            getCurrentLocation()
        }
        task.addOnFailureListener(activity, OnFailureListener { e: Exception? ->
            if (e is ResolvableApiException) {
                // Location settings are not satisfied, but this can be fixed
                // by showing the user a dialog.
                showLog(TAG, "onFailure: settingsCheck")
                try {
                    var resolvable: ResolvableApiException = e as ResolvableApiException
                    resolvable.startResolutionForResult(activity, REQUEST_CHECK_SETTINGS)
                } catch (sendEx: IntentSender.SendIntentException) {
                    // Ignore the error.
                }
            }
        })
    }

    fun buildLocationCallback(currentLocation: ((Location) -> Unit)? = null) {
        showLog(TAG, "buildLocationCallback: ")
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                if (locationResult == null) {
                    return
                }
                for (location in locationResult.locations) {
                    // Update UI with location data
                    currentLocation?.invoke(location)
                    onLocation?.let {
                        onLocation!!.onLocation(location)
                    }
//                    showLog(
//                        TAG,
//                        "buildLocationCallback lat => ${location.latitude} lng => ${location.longitude}"
//                    )
                }
            }
        }
    }

    fun getCurrentLocation(currentLocation: ((Location) -> Unit)? = null) {
        showLog(TAG, "getCurrentLocation")

        if (ActivityCompat.checkSelfPermission(
                activity,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                activity,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                activity,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                1
            )
            return
        }
        mFusedLocationClient!!.lastLocation
            .addOnSuccessListener(activity) { location: Location? ->
                showLog(TAG, "onSuccess: getLastLocation")
                // Got last known location. In some rare situations this can be null.
                if (location != null) {
                    currentLocation?.invoke(location)
                    onLocation?.let {
                        onLocation!!.onLocation(location)
                    }
//                    showLog(
//                        TAG,
//                        "getCurrentLocation lat => ${location.latitude} lng => ${location.longitude}"
//                    )
                } else {
                    showLog(TAG, "location is null")
                    buildLocationCallback()
                }
            }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        showLog(TAG, "onRequestPermissionsResult")
        when (requestCode) {
            REQUEST_GRANT_PERMISSION -> {
                getCurrentLocation()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        showLog(TAG, "onActivityResult: ")
        if (requestCode == REQUEST_CHECK_SETTINGS && resultCode == RESULT_OK)
            getCurrentLocation { cLocation ->
                currentLocation = cLocation
            }
        if (requestCode == REQUEST_CHECK_SETTINGS && resultCode == RESULT_CANCELED)
            showToastLong(activity, "Please enable Location settings...!!!");
    }

    interface OnLocation {
        fun onLocation(ongoingLocation: Location)
    }
}