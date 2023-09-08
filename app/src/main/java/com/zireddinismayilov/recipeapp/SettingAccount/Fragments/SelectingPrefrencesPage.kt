package com.zireddinismayilov.recipeapp.SettingAccount.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zireddinismayilov.recipeapp.R

class SelectingPrefrencesPage : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_selecting_prefrences_page, container, false)
    }
}