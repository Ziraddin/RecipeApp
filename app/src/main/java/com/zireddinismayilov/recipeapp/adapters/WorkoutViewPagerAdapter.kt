package com.zireddinismayilov.recipeapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.zireddinismayilov.recipeapp.R
import com.zireddinismayilov.recipeapp.databinding.ItemOnboardingViewpagerBinding
import com.zireddinismayilov.recipeapp.model.WorkoutModel


class WorkoutViewPagerAdapt(var list: List<WorkoutModel>) :
    RecyclerView.Adapter<WorkoutViewPagerAdapt.ViewHolder>() {

    inner class ViewHolder(var binding: ItemOnboardingViewpagerBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemOnboardingViewpagerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.Bg.setImageResource(list[position].image)
        holder.binding.textView3.setText(list[position].txt)
    }


}