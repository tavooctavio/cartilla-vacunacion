package com.example.cartilla

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val newList: ArrayList<News>):RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.news_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(newList[position])
    }

    override fun getItemCount(): Int {
        return newList.size
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        fun bindItems(news:News){
            val image = itemView.findViewById<ImageView>(R.id.newImage)
            val id = itemView.findViewById<TextView>(R.id.newId)
            val title = itemView.findViewById<TextView>(R.id.newsTitle)
            val resume = itemView.findViewById<TextView>(R.id.newsResumen)

            title.text = news.title.toString()
        }
    }
}