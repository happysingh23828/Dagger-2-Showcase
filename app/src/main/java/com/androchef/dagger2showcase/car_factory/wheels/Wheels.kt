package com.androchef.dagger2showcase.car_factory.wheels

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car.Companion.TAG

class Wheels {

    private var rims : Rims = Rims()

    private var tires : Tires = Tires()

    init {
        wheelsAreReady()
    }

    private fun wheelsAreReady(){
        rims.ready()
        tires.inflate()
        Log.d(TAG,"Wheels are ready.")
    }
}