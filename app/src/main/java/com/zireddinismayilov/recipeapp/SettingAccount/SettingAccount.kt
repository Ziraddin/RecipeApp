package com.zireddinismayilov.recipeapp.SettingAccount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.zireddinismayilov.recipeapp.R
import com.zireddinismayilov.recipeapp.databinding.ActivitySettingAccountBinding

class SettingAccount : AppCompatActivity() {
    lateinit var binding: ActivitySettingAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySettingAccountBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.setting_account_navbar) as NavHostFragment
        val navController = navHostFragment.navController
    }
}