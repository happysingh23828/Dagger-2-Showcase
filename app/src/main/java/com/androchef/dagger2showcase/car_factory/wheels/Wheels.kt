package com.androchef.dagger2showcase.car_factory.wheels

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car.Companion.TAG
import javax.inject.Inject

class Wheels @Inject constructor(val rims : Rims, val tires : Tires) {

    init {
        wheelsAreReady()
    }

    private fun wheelsAreReady(){
        Log.d(TAG,"Wheels are ready.")
    }
}