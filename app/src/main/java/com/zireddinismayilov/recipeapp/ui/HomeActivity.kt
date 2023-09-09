package com.zireddinismayilov.recipeapp.ui

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.zireddinismayilov.recipeapp.adapter.CategoryAdapter
import com.zireddinismayilov.recipeapp.adapter.TrendingMealAdapter
import com.zireddinismayilov.recipeapp.databinding.ActivityHomeBinding
import com.zireddinismayilov.recipeapp.viewmodel.CategoryViewModel
import com.zireddinismayilov.recipeapp.viewmodel.TrendingMealViewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var viewModel: CategoryViewModel
    private lateinit var adapter: CategoryAdapter
    private lateinit var trendingMealViewModel: TrendingMealViewModel
    private lateinit var trendingMealAdapter: TrendingMealAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(CategoryViewModel::class.java)

        adapter = CategoryAdapter()

        binding.categoriesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.categoriesRecyclerView.adapter = adapter

        viewModel.categories.observe(this) { categories ->
            adapter.submitList(categories)
        }


        trendingMealAdapter = TrendingMealAdapter()

        binding.trendingMealRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.trendingMealRecyclerView.adapter = trendingMealAdapter

        trendingMealViewModel = ViewModelProvider(this).get(TrendingMealViewModel::class.java)

        trendingMealViewModel.meals.observe(this) { meals ->
            trendingMealAdapter.submitList(meals)
        }


    }
}