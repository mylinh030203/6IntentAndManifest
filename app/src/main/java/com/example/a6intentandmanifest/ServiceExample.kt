package com.example.a6intentandmanifest

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ServiceExample : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        super.onCreate()
        Log.e("Intent","service được khỏi tạo")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Intent","service đã được hủy")
    }

}