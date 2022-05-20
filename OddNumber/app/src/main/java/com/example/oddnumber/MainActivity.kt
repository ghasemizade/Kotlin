package com.example.oddnumber

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
        val inputNumber2 = findViewById<TextView>(R.id.inputNumber2)
        val buttonShowname = findViewById<Button>(R.id.buttonShowname)

        buttonShowname.setOnClickListener(){
            var InputNum1 = inputNumber1.text.toString().toInt()
            var InputNum2 = inputNumber2.text.toString().toInt()

            var product = 1
            var i = InputNum1
            while (i < InputNum2){
                if(i % 2 == 1) {
                    product *= i
                }
                i++
            }
            Toast.makeText(this, "product : $product", Toast.LENGTH_LONG).show()

        }

    }
}