package com.example.treeminmax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt1 = findViewById<Button>(R.id.bt1)
        val bt2 = findViewById<Button>(R.id.bt2)
        val tn1 = findViewById<TextView>(R.id.tn1)
        val tn2 = findViewById<TextView>(R.id.tn2)
        val tn3 = findViewById<TextView>(R.id.tn3)
        val tn4 = findViewById<TextView>(R.id.tn4)
        val tn5 = findViewById<TextView>(R.id.tn5)

        bt1.setOnClickListener()
        {
            val a = tn1.text.toString().toInt()
            val b = tn2.text.toString().toInt()
            val c = tn3.text.toString().toInt()
            val d = tn4.text.toString().toInt()
            val e = tn5.text.toString().toInt()
            val min = arrayOf(a, b, c, d, e)

            min.sort()

            val min1 = min[0]
            val min2 = min[1]
            val min3 = min[2]
            val min4 = min[3]
            val min5 = min[4]

            Toast.makeText(this, "Minimum: $min1, $min2, $min3, $min4, $min5", Toast.LENGTH_LONG).show()
        }

        bt2.setOnClickListener()
        {
            val a = tn1.text.toString().toInt()
            val b = tn2.text.toString().toInt()
            val c = tn3.text.toString().toInt()
            val d = tn4.text.toString().toInt()
            val e = tn5.text.toString().toInt()
            val max = arrayOf(a, b, c, d, e)

            max.sort()

            val max1 = max[4]
            val max2 = max[3]
            val max3 = max[2]
            val max4 = max[1]
            val max5 = max[0]

            Toast.makeText(this, "Maximum: $max1, $max2, $max3, $max4, $max5", Toast.LENGTH_LONG).show()
        }
    }
}
