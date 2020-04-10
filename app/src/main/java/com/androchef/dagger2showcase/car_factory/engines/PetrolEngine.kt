package com.androchef.dagger2showcase.car_factory.engines

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car.Companion.TAG

class PetrolEngine constructor(private val horsePower: Int,private val engineCapacity: Int): Engine {

    override fun start() {
        Log.d(
            TAG,
            "Petrol Engine Started with HorsePower : $horsePower and EngineCapacity : $engineCapacity"
        )
    }
}