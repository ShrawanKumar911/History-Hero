package com.example.historyhero

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Hero_Adaptor(private val heroList: ArrayList<Heros>): RecyclerView.Adapter<Hero_Adaptor.HeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Hero_Adaptor.HeroViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.heros_1100,parent,false)
        return HeroViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Hero_Adaptor.HeroViewHolder, position: Int) {
        val currentItem = heroList[position]
        holder.heroImage.setImageResource(currentItem.heroImage)
        holder.heroName.text = currentItem.name
        holder.heroBirth.text = currentItem.birth
        holder.heroPlace.text = currentItem.place
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    class HeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val heroImage : ImageView = itemView.findViewById(R.id.heroimage)
        val heroName : TextView = itemView.findViewById(R.id.heroname)
        val heroBirth: TextView = itemView.findViewById(R.id.herodate)
        val heroPlace : TextView = itemView.findViewById(R.id.heroplace)

    }
}