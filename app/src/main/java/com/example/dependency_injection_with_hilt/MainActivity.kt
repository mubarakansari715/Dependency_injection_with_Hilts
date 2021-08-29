package com.example.dependency_injection_with_hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dependency_injection_with_hilt.Dependency.Car
import com.example.dependency_injection_with_hilt.InterfaceDependency.Main
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    @Inject
    lateinit var main: Main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car.getCar()
        main.getName()

    }
}