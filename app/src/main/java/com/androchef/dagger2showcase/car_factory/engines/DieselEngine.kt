package com.androchef.dagger2showcase.car_factory.engines

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    override fun start() {
        Log.d(Car.TAG, "Diesel Engine Started with HorsePower $horsePower")
    }
}