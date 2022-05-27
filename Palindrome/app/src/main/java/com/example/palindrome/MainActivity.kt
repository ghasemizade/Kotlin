package com.example.palindrome

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

        buttonShowname.setOnClickListener()
        {
            var InputNum1 = inputNumber1.text.toString().toInt()
            var reversnum = 0
            var usernumber = InputNum1
            if (InputNum1 < 0)
            {
                Toast.makeText(this,"false",Toast.LENGTH_SHORT).show()
            }
            while (InputNum1 != 0)
            {
                var modinput = InputNum1 % 10
                reversnum = reversnum * 10 + modinput
                InputNum1 /= 10
            }
            if (usernumber == reversnum)
            {
                Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"No", Toast.LENGTH_SHORT).show()
            }
        }
    }
}