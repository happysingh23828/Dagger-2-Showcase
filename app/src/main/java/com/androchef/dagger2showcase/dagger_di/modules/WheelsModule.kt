package com.androchef.dagger2showcase.dagger_di.modules

import com.androchef.dagger2showcase.car_factory.wheels.Rims
import com.androchef.dagger2showcase.car_factory.wheels.Tires
import com.androchef.dagger2showcase.car_factory.wheels.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {


    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        return Tires()
    }

    @Provides
    fun provideWheels(rims: Rims,tires: Tires): Wheels {
        rims.ready()
        tires.inflate()
        return Wheels(rims,tires)
    }

}