package com.example.xpowy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNumberX = findViewById<TextView>(R.id.inputNumberX)
        val inputNumberY = findViewById<TextView>(R.id.inputNumberY)
        val buttonShowname = findViewById<Button>(R.id.buttonShowname)

        buttonShowname.setOnClickListener{
            var PowNumberX = inputNumberX.text.toString().toInt()
            var PowNumberY = inputNumberY.text.toString().toInt()

            var res = pow(PowNumberX.toDouble(),PowNumberY.toDouble())


            Toast.makeText(this, "X power of Y =  $res", Toast.LENGTH_LONG).show()
        }
    }
}