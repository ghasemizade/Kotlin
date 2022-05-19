package com.example.tempproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val buttonShow1 = findViewById<Button>(R.id.buttonShow1)

//        buttonShow1.setOnClickListener{
//            Toast.makeText(this, "به برنامه نویسی اندروید خوش آمدید",Toast.LENGTH_LONG).show()
//        }
        val inputNumber = findViewById<TextView>(R.id.inputNumber)
        val buttonShowname = findViewById<Button>(R.id.buttonShowname)
        buttonShowname.setOnClickListener{
            var RadiusOfNumber = inputNumber.text.toString().toInt()
            var environment = 2 * RadiusOfNumber * 3.14
            var area = 3.14 * RadiusOfNumber * RadiusOfNumber
            var diameter = RadiusOfNumber * 2
            Toast.makeText(this, "environment : $environment , area : $area , diameter : $diameter" , Toast.LENGTH_LONG).show()
        }


    }
}