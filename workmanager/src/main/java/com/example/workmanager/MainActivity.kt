package com.example.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.work.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inputData = Data.Builder()
            .putString("user_data", "userDataJson")
            .putBoolean("other_data", true)
            .build()

        val constraints = Constraints.Builder()
            .setRequiresBatteryNotLow(true)
            .setRequiredNetworkType(NetworkType.CONNECTED)
//            .setRequiresCharging(true)
//            .setRequiresStorageNotLow(true)
//            .setRequiresDeviceIdle(true)
            .build()

        val oneTimeWorkRequest = OneTimeWorkRequestBuilder<MyWorkManager>()
            .setConstraints(constraints)
            .setInputData(inputData)
            .build()
        WorkManager.getInstance().enqueue(oneTimeWorkRequest)

        WorkManager.getInstance()
            .getWorkInfoByIdLiveData(oneTimeWorkRequest.id).observe(this, { workInfo ->
                val wasSuccess = if (workInfo != null && workInfo.state == WorkInfo.State.SUCCEEDED) {
                    workInfo.outputData.getString("is_success")
                } else {
                    "false"
                }

                if (workInfo != null && workInfo.state == WorkInfo.State.SUCCEEDED) {

                }
                Toast.makeText(this, "Work was success: $wasSuccess", Toast.LENGTH_LONG).show()
            })

    }
}