package com.androchef.dagger2showcase.manual_di.factory

import com.androchef.dagger2showcase.car_factory.wheels.Rims
import com.androchef.dagger2showcase.car_factory.wheels.Tires
import com.androchef.dagger2showcase.car_factory.wheels.Wheels

object WheelsFactory {

    fun getWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }

}