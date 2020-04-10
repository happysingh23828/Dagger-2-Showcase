package com.androchef.dagger2showcase.manual_di.factory

import com.androchef.dagger2showcase.car_factory.wheels.Tires

object TiresFactory {

    fun getTiers(): Tires {
        return Tires()
    }

}