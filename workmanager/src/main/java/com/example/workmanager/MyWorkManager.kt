package com.example.workmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf

class MyWorkManager(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {


    override fun doWork(): Result {

        val isSuccess = uploadUserData()
        val outputData = workDataOf("is_success" to isSuccess)

        return Result.success(outputData)

        return Result.success()

    }
    private fun uploadUserData(): String {
        // do upload work here
        return "Rahul"
    }
}