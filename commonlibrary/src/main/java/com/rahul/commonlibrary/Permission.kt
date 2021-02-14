package com.rahul.commonlibrary

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat

private const val locationRequestCode = 1000
var wayLatitude = 0.0
var wayLongitude: kotlin.Double = 0.0

fun locationPermission(context: Context): Boolean {
    // check permission
    if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_COARSE_LOCATION
        ) != PackageManager.PERMISSION_GRANTED
    ) {
        ActivityCompat.requestPermissions(
            context as Activity, arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION
            ),
            locationRequestCode
        )
        return false
    } else {
        // already permission granted
        return true
    }
}


fun showToastLong(context: Context?, message: String?) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}

fun showLog(TAG: String, message: String? = null) {
    Log.d(TAG, "$message")
}