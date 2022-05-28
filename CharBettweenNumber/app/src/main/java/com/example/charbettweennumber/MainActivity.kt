package com.example.charbettweennumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputNumber1 = findViewById<TextView>(R.id.inputNumber1)
        val buttonShowname = findViewById<Button>(R.id.buttonShowname)

        buttonShowname.setOnClickListener(){
            var InputNum1 = inputNumber1.text.toString().toInt()
            var i =0
            var modnum = 0
            var inputreverse = 0
            while (i < InputNum1)
            {
                modnum = InputNum1 % 10
                inputreverse *= 10 + modnum
                InputNum1 /= 10
                Toast.makeText(this,"$InputNum1@",Toast.LENGTH_SHORT).show()
                i++
            }
        }
    }
}