package com.example.averagenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputNumber1 = findViewById<TextView>(R.id.inputNumber1)
        val inputNumber2 = findViewById<TextView>(R.id.inputNumber2)
        val inputNumber3 = findViewById<TextView>(R.id.inputNumber3)
        val buttonShowname = findViewById<TextView>(R.id.buttonShowname)

        buttonShowname.setOnClickListener(){
            var InputNum1 = inputNumber1.text.toString().toInt()
            var InputNum2 = inputNumber2.text.toString().toInt()
            var InputNum3 = inputNumber3.text.toString().toInt()

            val sum = InputNum1 + InputNum2 + InputNum3
            var counter = 3
//            while (counter <= 3)
//            {
//                var InputNumber = inputNumber1.text.toString().toInt()
//                counter++
//
//            }
            var avg = sum / counter
            Toast.makeText(this, "average of numbers : $avg ",Toast.LENGTH_LONG).show()
        }

    }
}