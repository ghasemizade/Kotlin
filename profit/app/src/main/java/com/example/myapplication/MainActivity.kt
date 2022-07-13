package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Calculate = findViewById<Button>(R.id.Calculate)
        var amount = findViewById<EditText>(R.id.InputNumber)

        var oneMonth = findViewById<RadioButton>(R.id.radioButtonOneMonth)
        var threeMonth = findViewById<RadioButton>(R.id.radioButtonThreeMonth)
        var result = ""
        Calculate.setOnClickListener(){
            val amount = amount.text.toString().toInt()
            if (oneMonth.isChecked == true)
            {
                var result = (amount * 10 /12)
                Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
            }
            if (threeMonth.isChecked == true) {
                var result = (amount * 12 / 12) * 3
                Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
            }
        }
    }
}