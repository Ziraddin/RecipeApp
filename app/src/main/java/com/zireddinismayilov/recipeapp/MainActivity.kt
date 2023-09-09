package com.zireddinismayilov.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zireddinismayilov.recipeapp.databinding.ActivityMainBinding
import com.zireddinismayilov.recipeapp.onboarding.PageFirstFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val fragment = PageFirstFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.ziraddinfragment, fragment)
            .commit()
    }
}