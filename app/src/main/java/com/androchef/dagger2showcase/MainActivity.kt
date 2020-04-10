package com.androchef.dagger2showcase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androchef.dagger2showcase.car_factory.Car
import com.androchef.dagger2showcase.car_factory.extra.Remote
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startCar()
    }

    private fun startCar() {

        //Injecting this activity to access all resources of ActivityComponent
        val activityComponent =  (application as App).getAppComponent()
            .activityComponentFactory().create(12, 14)
        activityComponent.inject(this)

        car.drive()
    }
}
