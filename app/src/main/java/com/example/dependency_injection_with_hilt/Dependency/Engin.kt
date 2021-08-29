package com.example.dependency_injection_with_hilt.Dependency

import android.util.Log
import javax.inject.Inject

class Engin @Inject constructor() {
    fun getEngin() {
        Log.d("main_dependency", "getEngin: starting... ")
    }
}