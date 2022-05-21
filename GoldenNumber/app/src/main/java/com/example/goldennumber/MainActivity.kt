package com.example.goldennumber

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

            var ratio1 = InputNum1 / 1.618
            var ratio2 = InputNum1 * 1.618

            Toast.makeText(this, "the divine ratio of your input number : $ratio1 , $ratio2", Toast.LENGTH_LONG).show()
        }
    }
}