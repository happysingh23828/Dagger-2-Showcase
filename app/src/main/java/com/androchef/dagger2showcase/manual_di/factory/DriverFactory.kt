package com.androchef.dagger2showcase.manual_di.factory

import com.androchef.dagger2showcase.car_factory.drivers.Driver

object DriverFactory {

    fun getDriver(name: String): Driver {
        return Driver(name)
    }
}