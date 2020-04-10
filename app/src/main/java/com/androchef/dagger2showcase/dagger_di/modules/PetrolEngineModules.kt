package com.androchef.dagger2showcase.dagger_di.modules

import com.androchef.dagger2showcase.car_factory.engines.Engine
import com.androchef.dagger2showcase.car_factory.engines.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModules {

    @Binds
    abstract fun bindsEngine(petrolEngine: PetrolEngine): Engine

}