package com.anondo.myapplicationkt

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name:EditText = findViewById(R.id.name)
        var edt1:EditText = findViewById(R.id.weight)
        var edt2:EditText = findViewById(R.id.feet)
        var edt3:EditText = findViewById(R.id.inch)
        var btn:Button = findViewById(R.id.btn)
        var TvResult:TextView = findViewById(R.id.TvResult)


        btn.setOnClickListener{

            var wei : String = edt1.text.toString()
            var fee : String = edt2.text.toString()
            var inc : String = edt3.text.toString()


            var weight : Float = wei.toFloat()
            var feet : Float = fee.toFloat()
            var inch : Float = inc.toFloat()


            var high : Float = (feet*12)+inch

            var hight : Float = ((high*2.54).toFloat())/100

            var bmi :Float = weight/(hight*hight)

            TvResult.text= ""+bmi

        }



    }
}