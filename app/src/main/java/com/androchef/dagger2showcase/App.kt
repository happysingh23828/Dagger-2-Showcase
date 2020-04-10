package com.androchef.dagger2showcase

import android.app.Application
import com.androchef.dagger2showcase.dagger_di.components.AppComponent
import com.androchef.dagger2showcase.dagger_di.components.DaggerAppComponent
import com.androchef.dagger2showcase.dagger_di.modules.DriverModule

class App : Application() {


    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(DriverModule("Happy Singh"))
    }

    fun getAppComponent() = appComponent
}