package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.Scanner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var radius = 3
//    println (radius)
        var pi:Float = 3.14F

        var enviroments :Float = 2 * pi * radius
        var diameter = 2 * radius
        var area = pi * radius * radius

        Log.i("console", enviroments.toString())
        Log.i("console", diameter.toString())
        Log.i("console", area.toString())
    }
}