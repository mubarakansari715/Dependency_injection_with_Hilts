package com.example.dependency_injection_with_hilt.Dependency

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {
    fun getWheels() {
        Log.d("main_dependency", "getWheels: Starting...")
    }
}