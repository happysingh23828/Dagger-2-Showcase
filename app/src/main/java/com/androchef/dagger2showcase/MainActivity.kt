package com.androchef.dagger2showcase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androchef.dagger2showcase.car_factory.Car
import com.androchef.dagger2showcase.car_factory.extra.Remote

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startCar()
    }

    private fun startCar() {
        (application as App).appContainer.getCar().drive()
    }
}
