package com.androchef.dagger2showcase.car_factory

import android.util.Log
import com.androchef.dagger2showcase.car_factory.drivers.Driver
import com.androchef.dagger2showcase.car_factory.engines.Engine
import com.androchef.dagger2showcase.car_factory.extra.Remote
import com.androchef.dagger2showcase.car_factory.wheels.Wheels

class Car constructor(
    private val engine: Engine,
    private val driver: Driver,
    private val wheels: Wheels,
    private val remote: Remote
) {

    init {
        enableRemote(remote)
    }

    private fun enableRemote(remote: Remote) {
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