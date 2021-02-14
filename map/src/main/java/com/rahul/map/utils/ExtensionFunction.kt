package com.rahul.map.utils

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.ShapeDrawable
import android.os.Build
import android.os.Environment
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.snackbar.Snackbar
import com.rahul.map.R
import com.rahul.map.utils.Constant
import java.io.File
import java.text.SimpleDateFormat
import java.util.*


/*
fun getMarker(type : Any) = when(type){

    else->{}
}
*/

fun cameraBearing(latlng: LatLng): CameraPosition {
    var cameraPosition: CameraPosition = CameraPosition.Builder()
        .target(latlng)             // Sets the center of the map to current location
        .zoom(18F)                   // Sets the zoom
        .bearing(10F) // Sets the orientation of the camera to east
        .tilt(5F)// Sets the tilt of the camera to 0 degrees
        .build();
    return cameraPosition
}



fun hideKeyboard(context: Context) {
    val inputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(
        (context as Activity).findViewById<View>(R.id.content).getWindowToken(),
        0
    )
}

fun getRandomNumber(min: Int, max: Int): Int {
    return Random().nextInt(max - min + 1) + min
}


fun snackbar(context: Context, message: String) {
    val snackbar =
        Snackbar.make(
            (context as Activity).findViewById(android.R.id.content),
            message,
            Snackbar.LENGTH_SHORT
        )
    snackbar.show()
}

fun showToast(message: String, context: Context) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun GlobalLogcat(TAG: String, response: String) {
    Log.d(TAG, "$response")
}

fun backgroundWithoutStroke(radius: Float, color: Int): GradientDrawable {
    val border = GradientDrawable()
    border.cornerRadius = radius
    border.setColor(color)
    return border
}

fun backgroundWithStroke(radius: Float, color: Int, bordeColor: Int): GradientDrawable {
    val border = GradientDrawable()
    border.cornerRadius = radius
    border.setStroke(1, bordeColor)
    border.setColor(color)
    return border

}

fun isStoragePermissionGranted(activity: Activity): Boolean {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        if (activity.checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            return true
        } else {
            ActivityCompat.requestPermissions(
                activity,
                arrayOf<String>(
                    Manifest.permission.ACCESS_BACKGROUND_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ),
                Constant.locationCode
            )
            return false
        }
    } else { //permission is automatically granted on sdk<23 upon installation
        return true
    }
}

fun isStoragePermission(activity: Activity): Boolean {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        if (activity.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            createDirectoryAndSubDirectoty()
            return true
        } else {
            ActivityCompat.requestPermissions(
                activity,
                arrayOf<String>(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ),
                Constant.storage
            )
            return false
        }
    }
    return true
}

fun createDirectoryAndSubDirectoty() {
//        var new_folder  = File( getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS),"HiFriend")

    val new_folder = File(Environment.getExternalStorageDirectory(), Constant.directoryname)
    if (!new_folder.exists()) {
        if (new_folder.mkdir()) {
            Log.i("Info", "Folder succesfully created")

            for (i in Constant.folderArray) {
                val dir = File(
                    Environment.getExternalStorageDirectory().path + "/${Constant.directoryname}",
                    i
                )
                if (!dir.exists())
                    if (dir.mkdir()) {
                        Log.i("Info", "Folder $i succesfully created")
                    }
            }
        } else {
            Log.i("Info", "Failed to create folder")
        }
    } else {
        Log.i("Info", "Folder already exists")
    }

}

//fun currentDate(): String {
//
//    var cal = Calendar.getInstance()
//    var sdf = SimpleDateFormat("EEE, MMM d, yyyy")
//    return sdf.format(cal.getTime())
//
fun currentTime(): String {
    val calander = Calendar.getInstance()
    val timeFormat = SimpleDateFormat("HH:mm a")
    return timeFormat.format(calander.time)
}

fun currentDate(): String {
    val utc = TimeZone.getTimeZone("etc/UTC")
    var cal = Calendar.getInstance()
    val date = SimpleDateFormat("EEE, MMM d, yyyy", Locale.ENGLISH)
    date.setTimeZone(utc)
    return date.format(cal.getTime())
}

fun isNotNull(obj: Any?) = obj != null
fun isNull(obj: Any?) = obj == null
fun isNotEmpty(str: CharSequence?) = isEmpty(str).not()
fun isEmpty(str: CharSequence?): Boolean =
    str == null || str.isEmpty() || str.toString().equals("null", ignoreCase = true)


object ExtensionFunction {

    val border = GradientDrawable()
    @JvmStatic
    fun setBorder(borderColor: Int, borderWidthSize: Int = 0): ExtensionFunction {
        border.setStroke(borderWidthSize, borderColor)
        return this
    }

    @JvmStatic
    fun setRadius(
        cornerTopLeft: Float = 0f,
        cornerTopRight: Float = 0f,
        cornersBottomRight: Float = 0f,
        cornersBottomLeft: Float = 0f
    ): ExtensionFunction {
        border.cornerRadii = floatArrayOf(
            cornerTopLeft,
            cornerTopLeft,
            cornerTopRight,
            cornerTopRight,
            cornersBottomRight,
            cornersBottomRight,
            cornersBottomLeft,
            cornersBottomLeft
        )
        return this
    }

    @JvmStatic
    fun setRadius(cornerRadius: Float = 0f): ExtensionFunction {
        border.cornerRadius = cornerRadius
        return this
    }

    @JvmStatic
    fun setBackgroundColor(backgroundColor: Int): ExtensionFunction {
        border.setColor(backgroundColor)
        return this
    }

    @JvmStatic
    fun setShape(shape: String): GradientDrawable {
        when (shape) {
            Constant.ovalShape -> {
                border.shape = GradientDrawable.OVAL
            }
            Constant.rectangleShape -> {
                border.shape = GradientDrawable.RECTANGLE
            }
        }
        return border
    }

    fun setBackgroundColor1(textView: TextView, color: String) {
        val background = textView.background
        if (background is ShapeDrawable) {
            // cast to 'ShapeDrawable'
            background.paint.color = Color.parseColor(color)
        } else if (background is GradientDrawable) {
            // cast to 'GradientDrawable'
            background.setColor(Color.parseColor(color))
        } else if (background is ColorDrawable) {
            // alpha value may need to be set again after this call
            background.color = Color.parseColor(color)
        }
    }


    private fun customText(cancNature: String, context: Context): TextView {
        val textView = TextView(context)
        textView.text = cancNature
        textView.isSingleLine = true
        textView.ellipsize = TextUtils.TruncateAt.END
        textView.setTextColor(context.resources.getColor(R.color.white))
        return textView
    }
    private fun imageDynamic(i: Int, context: Context): ImageView {
        val imageView = ImageView(context)
        ImageViewCompat.setImageTintList(
            imageView, ColorStateList.valueOf(
                ContextCompat.getColor(
                    context,
                    R.color.white
                )
            )
        )
        return imageView
    }

    fun getOriginDestinationMarkerBitmap(): Bitmap {
        val height = 20
        val width = 20
        val bitmap = Bitmap.createBitmap(height, width, Bitmap.Config.RGB_565)
        val canvas = Canvas(bitmap)
        val paint = Paint()
        paint.color = Color.BLACK
        paint.style = Paint.Style.FILL
        paint.isAntiAlias = true
        canvas.drawRect(0F, 0F, width.toFloat(), height.toFloat(), paint)
        return bitmap
    }

    fun millimeterToKm(mm : Int)  =  "${mm / 1000} km"
}








