package com.zireddinismayilov.recipeapp.SettingAccount.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zireddinismayilov.recipeapp.R

class AdapterPref(var prefs: MutableList<String>) :
    RecyclerView.Adapter<AdapterPref.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val prefTextView = itemView.findViewById<TextView>(R.id.prefTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.selectingpref_row_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return prefs.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.prefTextView.text = prefs[position]
    }

}