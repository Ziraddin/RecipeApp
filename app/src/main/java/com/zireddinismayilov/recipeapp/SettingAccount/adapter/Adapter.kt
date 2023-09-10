package com.zireddinismayilov.recipeapp.SettingAccount.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zireddinismayilov.recipeapp.R

class Adapter(var locations: MutableList<String>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val countryTextView = itemView.findViewById<TextView>(R.id.CountryTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.settings_row_item, parent, false))
    }

    override fun getItemCount(): Int {
        return locations.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.countryTextView.text = locations[position]
    }

    fun filteredList(filteredList: MutableList<String>) {
        locations = filteredList
        notifyDataSetChanged()
    }

}