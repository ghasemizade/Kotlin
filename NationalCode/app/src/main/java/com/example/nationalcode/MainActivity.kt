package com.example.nationalcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt = findViewById<Button>(R.id.bt)
        val tn = findViewById<TextView>(R.id.tn)

        bt.setOnClickListener()
        {
            val a = tn.text.toString().toInt()
            var num = a
            val n = a
            val A = a % 10
            var B = 0
            var C = 0
            var i = 0
            var mod = 0

            while (i < n)
            {
                mod = num % 10
                B += ((B * 10) + mod) * 10
                num /= 10
            }
            C = B % 11

            if (C == 0 && A == C)
            {
                Toast.makeText(this, "this id number is true", Toast.LENGTH_SHORT).show()
            }
            else if (C == 1 && A == 1)
            {
                Toast.makeText(this, "this id number is true", Toast.LENGTH_SHORT).show()
            }
            else if (C > 1 && A == 11 - C)
            {
                Toast.makeText(this, "this id number is true", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "kidding me??? this id code is false!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}