package com.zireddinismayilov.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zireddinismayilov.recipeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
    //Karam
}