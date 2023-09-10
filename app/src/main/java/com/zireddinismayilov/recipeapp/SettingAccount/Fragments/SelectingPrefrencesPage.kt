package com.zireddinismayilov.recipeapp.SettingAccount.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.GridLayoutManager
import com.zireddinismayilov.recipeapp.R
import com.zireddinismayilov.recipeapp.SettingAccount.adapter.AdapterPref
import com.zireddinismayilov.recipeapp.databinding.FragmentSelectingPrefrencesPageBinding

class SelectingPrefrencesPage : Fragment() {

    val prefs = mutableListOf(
        "Healthy",
        "Quick",
        "Breakfast",
        "Lunch",
        "Dessert",
        "Drink",
        "Fast Food",
        "Cuisine",
        "Snack",
        "Dinner",
        "Soup",
        "Traditional"
    )
    lateinit var binding: FragmentSelectingPrefrencesPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectingPrefrencesPageBinding.inflate(inflater, container, false)
        setUpRecyclerView()
        addRemove()
        setUpBtn()
        return binding.root
    }

    fun setUpBtn() {
        binding.btn.setOnClickListener {
            val navHostFragment =
                requireActivity().supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController
            navController.navigate(R.id.action_selectingPrefrencesPage_to_createProfilePage)
        }
    }

    fun addRemove() {
        binding.add.setOnClickListener {
            binding.number.apply {
                if (binding.number.text.toString().toInt() >= 0) {
                    text = (text.toString().toInt() + 1).toString()
                }
            }
        }
        binding.remove.setOnClickListener {
            binding.number.apply {
                if (binding.number.text.toString().toInt() > 0) {
                    text = (text.toString().toInt() - 1).toString()
                }
            }
        }
    }

    fun setUpRecyclerView() {
        binding.recyclerView.adapter = AdapterPref(prefs)
        binding.recyclerView.layoutManager =
            GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
    }
}