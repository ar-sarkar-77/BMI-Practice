package com.anondo.myapplicationkt

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btnRecalculate: Button = findViewById(R.id.btnRecalculate)
        val tvBmiValue: TextView = findViewById(R.id.tvBmiValue)
        val tvBmiCategory: TextView = findViewById(R.id.tvBmiCategory)

        val bmi = intent.getFloatExtra("bmi", 0.0f)
        val name = intent.getStringExtra("name")

        tvBmiValue.text = String.format("%.1f", bmi)

        val category = when {
            bmi < 18.5 -> "Underweight"
            bmi in 18.5..24.9 -> "Normal weight"
            bmi in 25.0..29.9 -> "Overweight"
            bmi >= 30.0 -> "Obese"
            else -> "Invalid BMI"
        }

        tvBmiCategory.text = "$name, you are $category."

        btnRecalculate.setOnClickListener {
            finish()
        }
    }
}
