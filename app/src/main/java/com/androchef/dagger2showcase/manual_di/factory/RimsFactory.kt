package com.androchef.dagger2showcase.manual_di.factory

import com.androchef.dagger2showcase.car_factory.wheels.Rims

object RimsFactory {

    fun getRims(): Rims {
        return Rims()
    }

}