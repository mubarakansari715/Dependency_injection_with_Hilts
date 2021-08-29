package com.example.dependency_injection_with_hilt.InterfaceDependency

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One {
    fun getName()
}

class ImplimentOne @Inject constructor() : One {
    override fun getName() {
        Log.d("main_dependency", "getName: Name is Happy")
    }
}

class Main @Inject constructor(private val one: One) {
    fun getName() {
        one.getName()
    }
}

// first way
/*
@Module
@InstallIn(ActivityComponent::class)
abstract class AppModel {
    @Binds
    abstract fun bindingInterface(
        implimentOne: ImplimentOne
    ): One
}
*/


// second way
@Module
@InstallIn(SingletonComponent::class)
class AppModule() {
    @Provides
    @Singleton
    fun binding(): One = ImplimentOne()
}

