package com.example.product_without_product

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

            var prd = 0
            var counter = 1
            while (counter <= InputNum2)
            {
                prd += InputNum1
                counter++
            }

            Toast.makeText(this, "product : $prd", Toast.LENGTH_LONG).show()
        }
    }
}