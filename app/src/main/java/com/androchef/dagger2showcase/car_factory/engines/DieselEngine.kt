package com.androchef.dagger2showcase.car_factory.engines

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car

class DieselEngine  : Engine {

    private var horsePower : Int = 20

    override fun start() {
        Log.d(Car.TAG, "Diesel Engine Started with HorsePower $horsePower")
    }
}