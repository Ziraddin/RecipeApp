package com.zireddinismayilov.recipeapp.SettingAccount.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zireddinismayilov.recipeapp.databinding.FragmentCreateProfilePageBinding

class CreateProfilePage : Fragment() {
    lateinit var binding: FragmentCreateProfilePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateProfilePageBinding.inflate(inflater, container, false)
        return binding.root
    }
}