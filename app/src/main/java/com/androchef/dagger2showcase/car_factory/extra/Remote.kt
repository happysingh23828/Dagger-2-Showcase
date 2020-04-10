package com.androchef.dagger2showcase.car_factory.extra

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car
import com.androchef.dagger2showcase.car_factory.Car.Companion.TAG
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car : Car){
        Log.d(TAG,"Remote Connected")
    }
}