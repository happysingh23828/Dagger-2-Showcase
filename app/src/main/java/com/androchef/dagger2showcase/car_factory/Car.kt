package com.androchef.dagger2showcase.car_factory

import android.util.Log
import com.androchef.dagger2showcase.car_factory.drivers.Driver
import com.androchef.dagger2showcase.car_factory.engines.Engine
import com.androchef.dagger2showcase.car_factory.extra.Remote
import com.androchef.dagger2showcase.car_factory.wheels.Wheels
import com.androchef.dagger2showcase.dagger_di.scope.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(var engine: Engine,var driver: Driver) { ///Construction injection

    //Field Injection
    @Inject
    lateinit var wheels: Wheels

    //Method Injection
    @Inject
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