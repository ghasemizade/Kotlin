package com.example.completenumber

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

            var sum = 0
            var counter = 1
            while (counter < InputNum1)
            {
                if (InputNum1 % counter == 0)
                {
                    sum += counter
                }
                counter++
            }
            if (sum == InputNum1)
            {
                Toast.makeText(this,"Yes",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this, "No",Toast.LENGTH_LONG).show()
            }
        }
    }
}