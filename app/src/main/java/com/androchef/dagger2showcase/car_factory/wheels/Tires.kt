package com.androchef.dagger2showcase.car_factory.wheels

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car.Companion.TAG

class Tires {

    //We don't own this class so assume it as Third party library's class.
    fun inflate(){
        Log.d(TAG,"Tires Inflated")
    }
}