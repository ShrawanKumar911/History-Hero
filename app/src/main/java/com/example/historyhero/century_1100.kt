package com.example.historyhero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class century_1100 : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Heros>
    private lateinit var imageId: Array<Int>
    private lateinit var name: Array<String>
    private lateinit var birth: Array<String>
    private lateinit var place: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_century1100)

        imageId = arrayOf(
            R.drawable.home_history
        )
        name = arrayOf(
            "Chhatrapati Shivaji Maharaj"
        )
        birth = arrayOf(
            "29-09-2004"
        )
        place = arrayOf(
            "Maharashtra"
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Heros>()
        getUserdata()
    }

    private fun getUserdata() {
        for (i in imageId.indices){
            val Hero = Heros(imageId[i],name[i],birth[i],place[i])
            newArrayList.add(Hero)

        }

        newRecyclerView.adapter = Hero_Adaptor(newArrayList)
    }

}