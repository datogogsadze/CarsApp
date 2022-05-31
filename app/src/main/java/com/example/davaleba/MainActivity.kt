package com.example.davaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car1 = name(
            name = "Porsche Panamera",
            engine = 4.0F,
            year = 2020

        )
        val car2 = name(
            name = "Toyota Supra",
            engine = 3.0F,
            year = 2000

        )

        App.instance.gh.getCarDao().insert(car1, car2)

        App.instance.gh.getCarDao().getAllCars()?.forEach {  car ->
            Log.i("DatosLog", car.toString())
        }

    }
}