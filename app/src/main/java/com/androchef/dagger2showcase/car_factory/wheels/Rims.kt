package com.androchef.dagger2showcase.car_factory.wheels

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car


class Rims {

    //We don't own this class so assume it as Third party library's class.
    fun ready(){
        Log.d(Car.TAG,"Rimes Ready")
    }
}