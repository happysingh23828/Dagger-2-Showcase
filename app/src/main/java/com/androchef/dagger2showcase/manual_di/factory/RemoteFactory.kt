package com.androchef.dagger2showcase.manual_di.factory

import com.androchef.dagger2showcase.car_factory.extra.Remote

object RemoteFactory {

    fun getRemote(): Remote {
        return Remote()
    }
}