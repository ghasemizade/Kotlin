package com.example.trianglevalidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var sideA:Int = 6
        var sideB:Int = 8
        var sideC:Int = 10


        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA)
        {
            var str = "this numbers create triangle :)"
            Log.i("console", str.toString())
        }
        else
        {
            var str2 = "this number s does not create triangle"
            Log.i("console", str2.toString())
        }
    }
}