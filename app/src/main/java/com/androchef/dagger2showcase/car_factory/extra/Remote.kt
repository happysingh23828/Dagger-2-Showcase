package com.androchef.dagger2showcase.car_factory.extra

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car
import com.androchef.dagger2showcase.car_factory.Car.Companion.TAG

class Remote {

    fun setListener(car : Car){
        Log.d(TAG,"Remote Connected")
    }
}