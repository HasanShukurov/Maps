package com.example.maps.model.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.maps.databinding.RecylclerRowBinding
import com.example.maps.model.Place
import com.example.maps.view.MapsActivity

class PlaceAdapter(val placeList: List<Place>):RecyclerView.Adapter< PlaceAdapter.PlaceHolder>() {
    class PlaceHolder(val recyclerRowBinding: RecylclerRowBinding): RecyclerView.ViewHolder(recyclerRowBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceHolder {
        val recyclerRowBinding = RecylclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
         return PlaceHolder(recyclerRowBinding)
    }

    override fun onBindViewHolder(holder: PlaceHolder, position: Int) {
        holder.recyclerRowBinding.recyclerViewTextView.text = placeList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,MapsActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return placeList.size
    }
}