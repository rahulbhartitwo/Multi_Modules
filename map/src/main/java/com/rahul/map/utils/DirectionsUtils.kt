package com.rahul.map.utils

import android.util.Log
import com.google.android.gms.maps.model.LatLng
import java.util.ArrayList

class DirectionsUtils {

    fun getBearing(begin: LatLng, end: LatLng): Float {
        val lat = Math.abs(begin.latitude - end.latitude)
        val lng = Math.abs(begin.longitude - end.longitude)
        if (begin.latitude < end.latitude && begin.longitude < end.longitude)
            return Math.toDegrees(Math.atan(lng / lat)).toFloat()
        else if (begin.latitude >= end.latitude && begin.longitude < end.longitude)
            return (90 - Math.toDegrees(Math.atan(lng / lat)) + 90).toFloat()
        else if (begin.latitude >= end.latitude && begin.longitude >= end.longitude)
            return (Math.toDegrees(Math.atan(lng / lat)) + 180).toFloat()
        else if (begin.latitude < end.latitude && begin.longitude >= end.longitude)
            return (90 - Math.toDegrees(Math.atan(lng / lat)) + 270).toFloat()
        return -1f
    }

    companion object {
        private val TAG = "DIRECTION"
        fun bearingBetweenLocations(latLng1: LatLng, latLng2: LatLng): Double {
            val PI = 3.14159
            val lat1 = latLng1.latitude * PI / 180
            val long1 = latLng1.longitude * PI / 180
            val lat2 = latLng2.latitude * PI / 180
            val long2 = latLng2.longitude * PI / 180
            val dLon = long2 - long1
            val y = Math.sin(dLon) * Math.cos(lat2)
            val x = Math.cos(lat1) * Math.sin(lat2) - (Math.sin(lat1)
                    * Math.cos(lat2) * Math.cos(dLon))
            var brng = Math.atan2(y, x)
            brng = Math.toDegrees(brng)
            brng = (brng + 360) % 360
            return brng
        }


        fun getRequestUrl(originLatLng: LatLng?, destLatLng: LatLng?): String? {
            if (originLatLng != null && destLatLng != null) {
                val strOrigin = "origin=" + originLatLng.latitude + "," + originLatLng.longitude
                val strDest = "destination=" + destLatLng.latitude + "," + destLatLng.longitude

                Log.d(TAG, "Origin String : $strOrigin")
                Log.d(TAG, "Destination String : $strDest")
                // Set value enable to Sensor.
                //            String sensor = "sensor=true";
                val transit_routing_preference = "transit_routing_preference=less_driving"
                // Mode for find direction
                val mode = "mode=driving"

                // Build the full param
                val param = "$strOrigin&$strDest&&$mode&$transit_routing_preference"
                Log.d(TAG, "Params : $param")
                // Output Format
                val output = "json"
                // Create Url to Request.
                val url =
                    "https://maps.googleapis.com/maps/api/directions/" + output + "?" + param + "&key=" + Constant.GOOGLE_KEY//+ "&" +"sensor=true";
                Log.d(TAG, "Complete Url : $url")
                return url
            }
            return null
        }


        fun decodePoly(encoded: String): List<LatLng> {
            val poly = ArrayList<LatLng>()
            var index = 0
            val len = encoded.length
            var lat = 0
            var lng = 0

            while (index < len) {
                var b: Int
                var shift = 0
                var result = 0
                do {
                    b = encoded[index++].toInt() - 63
                    result = result or (b and 0x1f shl shift)
                    shift += 5
                } while (b >= 0x20)
                val dlat = if (result and 1 != 0) (result shr 1).inv() else result shr 1
                lat += dlat

                shift = 0
                result = 0
                do {
                    b = encoded[index++].toInt() - 63
                    result = result or (b and 0x1f shl shift)
                    shift += 5
                } while (b >= 0x20)
                val dlng = if (result and 1 != 0) (result shr 1).inv() else result shr 1
                lng += dlng

                val p = LatLng(
                    lat.toDouble() / 1E5,
                    lng.toDouble() / 1E5
                )
                poly.add(p)
            }

            return poly
        }
    }

}