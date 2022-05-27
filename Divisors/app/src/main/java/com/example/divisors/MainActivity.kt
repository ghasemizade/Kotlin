package com.example.divisors

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
            var counter = 1
            while (counter <= InputNum1)
            {
                if (InputNum1 % counter == 0)
                {
                    Toast.makeText(this, "this is divisor of your number input : $counter",Toast.LENGTH_SHORT).show()
                }
                counter++
            }
        }
    }
}