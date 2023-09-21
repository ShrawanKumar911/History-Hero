package com.example.historyhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner

class StoYear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sto_year)

        val button = findViewById<Button>(R.id.enter)

        val hel = findViewById<ImageView>(R.id.helpl)
        val home = findViewById<ImageView>(R.id.homel)
        val feed = findViewById<ImageView>(R.id.feedbackl)
        hel.setOnClickListener(){
            val intent = Intent(this,help::class.java)
            startActivity(intent)
        }
        home.setOnClickListener(){
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
        feed.setOnClickListener(){
            val intent = Intent(this,feedback::class.java)
            startActivity(intent)
        }

        val spinner: Spinner = findViewById<Spinner>(R.id.spinne)
        val items = arrayOf(1100, 1200, 1300, 1400,1500, 1600, 1700, 1800, 1900)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View?, position: Int, id: Long) {
                val selectedItem = items[position]
                button.setOnClickListener() {
                    if (selectedItem == 1100) {
                        val intent = Intent(this@StoYear, CenOne::class.java)
                        val value = 0
                        intent.putExtra("Century",value)
                        startActivity(intent)
                    }else if(selectedItem == 1200){
                        val intent = Intent(this@StoYear,CenOne::class.java)
                        val value = 1
                        intent.putExtra("Century",value)
                        startActivity(intent)
                    }else if(selectedItem == 1300){
                        val intent = Intent(this@StoYear,CenOne::class.java)
                        val value = 2
                        intent.putExtra("Century",value)
                        startActivity(intent)
                    }else if(selectedItem == 1400){
                        val intent = Intent(this@StoYear,CenOne::class.java)
                        val value = 3
                        intent.putExtra("Century",value)
                        startActivity(intent)
                    }else if(selectedItem == 1500){
                        val intent = Intent(this@StoYear,CenOne::class.java)
                        val value = 4
                        intent.putExtra("Century",value)
                        startActivity(intent)
                    }else if(selectedItem == 1600){
                        val intent = Intent(this@StoYear,CenOne::class.java)
                        val value = 5
                        intent.putExtra("Century",value)
                        startActivity(intent)
                    }else if(selectedItem == 1700){
                        val intent = Intent(this@StoYear,CenOne::class.java)
                        val value = 6
                        intent.putExtra("Century",value)
                        startActivity(intent)
                    }else if(selectedItem == 1800){
                        val intent = Intent(this@StoYear,CenOne::class.java)
                        val value = 7
                        intent.putExtra("Century",value)
                        startActivity(intent)
                    }else if(selectedItem == 1900){
                        val intent = Intent(this@StoYear,CenOne::class.java)
                        val value = 8
                        intent.putExtra("Century",value)
                        startActivity(intent)
                    }
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

    }
}