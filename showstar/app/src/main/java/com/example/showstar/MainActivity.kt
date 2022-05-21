package com.example.showstar

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
            var star = InputNum1
            while (counter <= InputNum1)
            {
                Toast.makeText(this, "*",Toast.LENGTH_LONG).show()
                counter++
            }
        }
    }
}