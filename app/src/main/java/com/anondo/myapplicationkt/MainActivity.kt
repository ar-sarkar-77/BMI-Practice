package com.anondo.myapplicationkt

import android.content.Intent
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
        var nam:EditText = findViewById(R.id.name)
        var edt1:EditText = findViewById(R.id.weight)
        var edt2:EditText = findViewById(R.id.feet)
        var edt3:EditText = findViewById(R.id.inch)
        var btn:Button = findViewById(R.id.btn)


        btn.setOnClickListener{

            var weight = edt1.text.toString().toFloat()
            var feet = edt2.text.toString().toFloat()
            var inch  = edt3.text.toString().toFloat()
            var name  = nam.text.toString()

           if (weight!=null && feet!=null && inch!=null){

               var high : Float = (feet*12)+inch
               var hight : Float = ((high*2.54).toFloat())/100

               var bmi :Float = (weight/(hight*hight)).toFloat()

               var intent = Intent(this , ResultActivity::class.java)
               intent.putExtra("bmi" , bmi)
               intent.putExtra("name" , name)
               startActivity(intent)

           }else{
               if (weight==null){
                   edt1.setError("Enter your weight")
               }else if (feet==null){
                   edt2.setError("Enter your hight")
               }
               else{
                   edt3.setError("Enter your hight")
               }
           }

        }



    }
}