package com.example.cartilla

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ToggleButton
import androidx.recyclerview.widget.RecyclerView

class ShotsAdapter (val shotList:ArrayList<Vacuna>):RecyclerView.Adapter<ShotsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ShotsAdapter.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.shot, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindIteams(shotList[position])
    }

    override fun getItemCount(): Int {
        return shotList.size
    }

    class ViewHolder(iteamView:View):RecyclerView.ViewHolder(iteamView){

        fun bindIteams(shot:Vacuna){

            val id = itemView.findViewById<TextView>(R.id.shotid)
            val name = itemView.findViewById<TextView>(R.id.nameShot)
            val taken = itemView.findViewById<ToggleButton>(R.id.toggle)

            name.text = shot.name.toString()
            if (shot.taken){
                taken.isChecked = true
                taken.isEnabled = false
            }
        }
    }
}