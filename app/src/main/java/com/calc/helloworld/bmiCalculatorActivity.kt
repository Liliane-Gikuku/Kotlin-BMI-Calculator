package com.calc.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bmiCalculatorActivity : AppCompatActivity() {
    lateinit var btnMoney: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        btnMoney = findViewById(R.id.btnMoney)
        btnMoney.setOnClickListener {
            val intent = Intent(this,SendMoneyActivity::class.java)
            startActivity(intent)

        }
    }
}