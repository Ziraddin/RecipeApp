package com.zireddinismayilov.recipeapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zireddinismayilov.recipeapp.R
import com.zireddinismayilov.recipeapp.databinding.TrendingMealRowBinding
import com.zireddinismayilov.recipeapp.model.MealItem
import androidx.recyclerview.widget.DiffUtil

class TrendingMealAdapter : ListAdapter<MealItem, TrendingMealAdapter.ViewHolder>(MealDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = TrendingMealRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val meal = getItem(position)
        holder.bind(meal)
    }

    inner class ViewHolder(private val binding: TrendingMealRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(meal: MealItem) {
            // Load the meal image using Glide
            Glide.with(binding.root.context)
                .load(meal.strMealThumb)
                .placeholder(R.drawable.logo_home_karam) // Placeholder image while loading
                .into(binding.trendingMealImageView)

            binding.trendingMealTextView.text = meal.strMeal
        }
    }
}


class MealDiffCallback : DiffUtil.ItemCallback<MealItem>() {
    override fun areItemsTheSame(oldItem: MealItem, newItem: MealItem): Boolean {
        return oldItem.strMeal == newItem.strMeal
    }

    override fun areContentsTheSame(oldItem: MealItem, newItem: MealItem): Boolean {
        return oldItem == newItem
    }
}

