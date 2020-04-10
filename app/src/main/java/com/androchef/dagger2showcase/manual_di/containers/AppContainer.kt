package com.androchef.dagger2showcase.manual_di.containers

import com.androchef.dagger2showcase.car_factory.Car
import com.androchef.dagger2showcase.car_factory.drivers.Driver
import com.androchef.dagger2showcase.car_factory.engines.Engine
import com.androchef.dagger2showcase.car_factory.extra.Remote
import com.androchef.dagger2showcase.car_factory.wheels.Rims
import com.androchef.dagger2showcase.car_factory.wheels.Tires
import com.androchef.dagger2showcase.car_factory.wheels.Wheels
import com.androchef.dagger2showcase.manual_di.factory.*

// Refer [https://developer.android.com/training/dependency-injection/manual#dependencies-container]
// for Manual Dependencies

// Container of objects shared across the whole app
class AppContainer {

    // Since you want to expose car out of the container, you need to satisfy its dependencies
    // all dependencies

    //Rimes
    private val rimes: Rims = RimsFactory.getRims()

    //Tires
    private val tires: Tires = TiresFactory.getTiers()

    //Engine
    private val engine: Engine = EngineFactory.getPetrolEngine(12, 13)

    //Remote
    private val remote: Remote = RemoteFactory.getRemote()

    //Wheels
    private val wheels: Wheels = WheelsFactory.getWheels(rimes, tires)

    //Driver
    private val driver: Driver = DriverFactory.getDriver("Happy Singh")

    //Make your car object and expose it by getter Method.
    private val car: Car = Car(engine, driver)

    //exposing car to the world [LOL]
    fun getCar(): Car {
        return car
    }
}