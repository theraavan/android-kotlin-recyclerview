package com.gradlic.recyclerviewbasic.basic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gradlic.recyclerviewbasic.R

class BasicAdapter : RecyclerView.Adapter<BasicAdapter.ViewHolder>(){

    var data = mutableListOf<Basic>()

    init {
        data.add(Basic("Kotlin", "Most popular and advance language in android world"))
        data.add(Basic("Kotlin", "It is also popular in backend development world"))
        data.add(Basic("Java", "It was a love for every developer and still hot in job industry"))
        data.add(Basic("Java", "Spring boot is developed using java"))
        data.add(Basic("Kotlin", "You can use kotlin with spring boot"))
        data.add(Basic("Java", "You can use java too with spring boot"))
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.title.text = item.title
        holder.description.text = item.description
        holder.image.setImageResource(R.drawable.fb)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater =LayoutInflater.from(parent.context)
        val view =layoutInflater.inflate(R.layout.list_item_basic, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.title_text)
        val description: TextView = itemView.findViewById(R.id.description_text)
        val image: ImageView = itemView.findViewById(R.id.basic_image)
    }
}