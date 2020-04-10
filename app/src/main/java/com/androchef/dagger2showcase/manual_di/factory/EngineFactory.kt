package com.androchef.dagger2showcase.manual_di.factory

import com.androchef.dagger2showcase.car_factory.engines.PetrolEngine

object EngineFactory {

    fun getPetrolEngine(horsePower: Int, engineCapacity: Int): PetrolEngine {
        return PetrolEngine(horsePower, engineCapacity)
    }
}