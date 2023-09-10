package com.zireddinismayilov.recipeapp.SettingAccount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.zireddinismayilov.recipeapp.R
import com.zireddinismayilov.recipeapp.databinding.ActivitySettingAccountBinding

class SettingAccount : AppCompatActivity() {
    lateinit var binding: ActivitySettingAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
    }
}