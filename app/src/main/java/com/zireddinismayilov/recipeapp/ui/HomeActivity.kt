package com.zireddinismayilov.recipeapp.ui

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.zireddinismayilov.recipeapp.R
import com.zireddinismayilov.recipeapp.adapter.CategoryAdapter
import com.zireddinismayilov.recipeapp.adapter.TrendingMealAdapter
import com.zireddinismayilov.recipeapp.databinding.ActivityHomeBinding
import com.zireddinismayilov.recipeapp.ui.fragments.ArchieveFragment
import com.zireddinismayilov.recipeapp.ui.fragments.MagicFragment
import com.zireddinismayilov.recipeapp.ui.fragments.MainFragment
import com.zireddinismayilov.recipeapp.ui.fragments.ProfileFragment
import com.zireddinismayilov.recipeapp.ui.fragments.SettingsFragment
import com.zireddinismayilov.recipeapp.viewmodel.CategoryViewModel
import com.zireddinismayilov.recipeapp.viewmodel.TrendingMealViewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var viewModel: CategoryViewModel
    private lateinit var adapter: CategoryAdapter
    private lateinit var trendingMealViewModel: TrendingMealViewModel
    private lateinit var trendingMealAdapter: TrendingMealAdapter
    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(MainFragment())
        bottomNav = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.magicpen -> {
                    loadFragment(MagicFragment())
                    true
                }
                R.id.archieve -> {
                    loadFragment(ArchieveFragment())
                    true
                }
                R.id.settings -> {
                    loadFragment(SettingsFragment())
                    true
                }
                R.id.profile -> {
                    loadFragment(ProfileFragment())
                    true
                }

                else -> {false}
            }
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
//
//        binding.bottomNavigationView.background = null
//        binding.bottomNavigationView.menu.getItem(2).isEnabled = false

//        viewModel = ViewModelProvider(this).get(CategoryViewModel::class.java)
//
//        adapter = CategoryAdapter()
//
//        binding.categoriesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        binding.categoriesRecyclerView.adapter = adapter
//
//        viewModel.categories.observe(this) { categories ->
//            adapter.submitList(categories)
//        }
//
//
//        trendingMealAdapter = TrendingMealAdapter()
//
//        binding.trendingMealRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        binding.trendingMealRecyclerView.adapter = trendingMealAdapter
//
//        trendingMealViewModel = ViewModelProvider(this).get(TrendingMealViewModel::class.java)
//
//        trendingMealViewModel.meals.observe(this) { meals ->
//            trendingMealAdapter.submitList(meals)
//        }



}