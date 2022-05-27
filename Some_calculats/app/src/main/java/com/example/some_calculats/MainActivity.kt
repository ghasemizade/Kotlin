package com.example.some_calculats

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
        val inputNumber3 = findViewById<TextView>(R.id.inputNumber3)
        val inputNumber4 = findViewById<TextView>(R.id.inputNumber4)
        val buttonShowname = findViewById<Button>(R.id.buttonShowname)

        buttonShowname.setOnClickListener(){
            var InputNum1 = inputNumber1.text.toString().toInt()
            var InputNum2 = inputNumber2.text.toString().toInt()
            var InputNum3 = inputNumber3.text.toString().toInt()
            var InputNum4 = inputNumber4.text.toString().toInt()

            val MyArray = arrayOf(4)
            var min = MyArray[0]
            var max = MyArray[0]
            var counter = 0
            while (counter < 4)
            {
                if (MyArray[counter] < min)
                {
                    min = MyArray[counter]
                }
                if (MyArray[counter] > max)
                {
                    max = MyArray[counter]
                }
                counter++
            }
            var count = 4
            var avg: Int? = null
            var sum = InputNum1 + InputNum2 + InputNum3 + InputNum4
            avg = sum / count



            var v1 = (avg - InputNum1) + (avg - InputNum1)
            var v2 = (avg - InputNum2) + (avg - InputNum2)
            var v3 = (avg - InputNum3) + (avg - InputNum3)
            var v4 = (avg - InputNum4) + (avg - InputNum4)
            var variance = (v1 + v2 + v3 + v4) / 4

            Toast.makeText(this,"count,min,max,avg,variance : $count,$min,$max,$avg,$variance",Toast.LENGTH_SHORT).show()
        }
    }
}