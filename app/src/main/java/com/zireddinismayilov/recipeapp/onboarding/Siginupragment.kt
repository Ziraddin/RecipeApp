package com.zireddinismayilov.recipeapp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zireddinismayilov.recipeapp.databinding.FragmentSigininragmentBinding


class Siginupragment : Fragment() {

    private lateinit var binding: FragmentSigininragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSigininragmentBinding.inflate(layoutInflater)
        return binding.root
    }


}