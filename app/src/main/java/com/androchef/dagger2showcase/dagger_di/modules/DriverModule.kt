package com.androchef.dagger2showcase.dagger_di.modules

import com.androchef.dagger2showcase.car_factory.drivers.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(var driverName : String) {

    @Singleton
    @Provides
    fun provideDriver () : Driver {
        return Driver(driverName)
    }
}