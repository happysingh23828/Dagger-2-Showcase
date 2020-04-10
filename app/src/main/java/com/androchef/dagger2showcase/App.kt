package com.androchef.dagger2showcase

import android.app.Application
import com.androchef.dagger2showcase.manual_di.containers.AppContainer

class App : Application() {

    val appContainer = AppContainer()

    override fun onCreate() {
        super.onCreate()
    }
}