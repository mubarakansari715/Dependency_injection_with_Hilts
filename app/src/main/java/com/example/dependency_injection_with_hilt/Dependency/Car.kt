package com.example.dependency_injection_with_hilt.Dependency

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engin: Engin, private val wheels: Wheels) {
   /*Here @Inject constructor used for provide dependency*/

    fun getCar() {
        engin.getEngin()
        wheels.getWheels()
        Log.d("main_dependency", "getCar: Car is Running")
    }
}