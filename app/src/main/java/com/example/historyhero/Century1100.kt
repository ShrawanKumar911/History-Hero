package com.example.historyhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Century1100 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_century1100)

        var enter1 = findViewById<Button>(R.id.enter1)

        enter1.setOnClickListener(){
            val a = 1
            val intent = Intent(this,C_1100_1::class.java)
            intent.putExtra("One",a)
            startActivity(intent)
        }
    }




}