package com.androchef.dagger2showcase.car_factory.engines

import android.util.Log
import com.androchef.dagger2showcase.car_factory.Car.Companion.TAG

class PetrolEngine : Engine {

    private var horsePower: Int = 40

    private var engineCapacity: Int = 50

    override fun start() {
        Log.d(
            TAG,
            "Petrol Engine Started with HorsePower : $horsePower and EngineCapacity : $engineCapacity"
        )
    }
}