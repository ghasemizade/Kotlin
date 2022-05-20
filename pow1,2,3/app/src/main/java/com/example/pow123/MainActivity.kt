package com.example.pow123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputNumber = findViewById<TextView>(R.id.inputNumber)
        val buttonShowname = findViewById<Button>(R.id.buttonShowname)

        buttonShowname.setOnClickListener{
            var PowNumber = inputNumber.text.toString().toInt()
            var pow1 = PowNumber
            var pow2 = PowNumber * PowNumber
            var pow3 = PowNumber * PowNumber * PowNumber

            Toast.makeText(this, "power of 1,2,3 = $pow1 , $pow2 , $pow3", Toast.LENGTH_LONG).show()
        }
    }
}