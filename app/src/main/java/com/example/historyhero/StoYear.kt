package com.example.historyhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class StoYear : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        button = findViewById(R.id.enter)
        setContentView(R.layout.activity_sto_year)
        val spinner: Spinner = findViewById(R.id.spinne)
        val items = arrayOf(1100, 1200, 1300, 1400,1500, 1600, 1700, 1800, 1900, 2000)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View?, position: Int, id: Long) {
                val selectedItem = items[position]
                button.setOnClickListener() {
                    if (selectedItem == 1100){
                        val intent = Intent(this,century_1100::class.java)
                        startActivity(intent)
                    }
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {

            }
        }


    }

}