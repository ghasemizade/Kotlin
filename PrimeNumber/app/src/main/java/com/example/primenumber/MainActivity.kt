package com.example.primenumber

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
            var InputNum = inputNumber1.text.toString().toInt()

            var sum = 0
            var temp = InputNum / 2
            var newtemp = 0
            var i = 2
            while (i <= temp)
            {
                if (InputNum % i == 0)
                {
                    Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
                    newtemp = 1
                    i++
                }
                break
            }
            if (newtemp == 0)
            {
                Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
            }
        }
    }
}