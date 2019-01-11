package com.example.jerom.controle_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jerom.controle_app.R
import com.example.jerom.controle_app.models.Feature
import kotlinx.android.synthetic.main.item_earthquake.view.*


class EarthQuakeAdapter(private val earthquake: List<Feature>) : RecyclerView.Adapter<EarthQuakeAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): EarthQuakeAdapter.ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.item_earthquake, p0, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: EarthQuakeAdapter.ViewHolder, position: Int) {
        holder.bindItems(earthquake[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(earthQuake: Feature){

            itemView.textPlace.text = earthQuake.properties.place.toString()
            itemView.textMag.text = earthQuake.properties.mag.toString()
            itemView.textAlert.text = earthQuake.properties.detail.toString()


        }
    }

    override fun getItemCount(): Int {
        return earthquake.size
    }

}