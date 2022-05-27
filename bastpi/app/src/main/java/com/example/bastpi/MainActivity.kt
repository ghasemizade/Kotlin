package com.example.bastpi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
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
            //get input
            var InputNum = inputNumber1.text.toString().toInt()

            var p = 3.14f
            var circumference = 2 * p * InputNum
            var pi = circumference / InputNum
            Toast.makeText(this,"the expansion of pi number is : $pi",Toast.LENGTH_LONG).show()

        }
    }
}