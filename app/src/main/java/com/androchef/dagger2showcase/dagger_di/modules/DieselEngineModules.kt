package com.androchef.dagger2showcase.dagger_di.modules

import com.androchef.dagger2showcase.car_factory.engines.DieselEngine
import com.androchef.dagger2showcase.car_factory.engines.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModules(var horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideDieselEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }

}