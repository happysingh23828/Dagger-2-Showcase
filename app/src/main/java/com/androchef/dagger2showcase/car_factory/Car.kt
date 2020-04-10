package com.androchef.dagger2showcase.car_factory

import android.util.Log
import com.androchef.dagger2showcase.car_factory.drivers.Driver
import com.androchef.dagger2showcase.car_factory.engines.PetrolEngine
import com.androchef.dagger2showcase.car_factory.extra.Remote
import com.androchef.dagger2showcase.car_factory.wheels.Wheels

class Car {

    private var engine  = PetrolEngine()

    private var driver: Driver = Driver("Happy Singh")

    private var wheels: Wheels = Wheels()


    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver ${driver.name} drives.. $this")
    }

    companion object {
        const val TAG = "Dagger2Showcase"
    }

}