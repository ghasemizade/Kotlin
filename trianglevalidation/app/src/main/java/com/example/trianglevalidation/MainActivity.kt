package com.example.trianglevalidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNumber = findViewById<TextView>(R.id.inputNumber)
        val inputNumber1 = findViewById<TextView>(R.id.inputNumber1)
        val inputNumber2 = findViewById<TextView>(R.id.inputNumber2)
        val buttonShowname = findViewById<Button>(R.id.buttonShowname)


        buttonShowname.setOnClickListener(){

            var sideA = inputNumber.text.toString().toInt()
            var sideB = inputNumber.text.toString().toInt()
            var sideC = inputNumber.text.toString().toInt()

            if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA)
            {
                var str = "this numbers create triangle :)"
                Toast.makeText(this,str , Toast.LENGTH_LONG).show()
            }
            else
            {
                var str2 = "this number s does not create triangle"
                Toast.makeText(this, str2, Toast.LENGTH_LONG).show()
            }
        }

    }
}
