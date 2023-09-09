package com.zireddinismayilov.recipeapp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zireddinismayilov.recipeapp.R
import com.zireddinismayilov.recipeapp.adapters.WorkoutViewPagerAdapt
import com.zireddinismayilov.recipeapp.databinding.FragmentPageFirstBinding
import com.zireddinismayilov.recipeapp.model.WorkoutModel


class PageFirstFragment : Fragment() {
    private lateinit var binding: FragmentPageFirstBinding
    private var workoutList2 = mutableListOf<WorkoutModel>(
        WorkoutModel(
            image = R.drawable.onboardinfirst,
            txt = R.string.text_splash_first_frament,
        ),
        WorkoutModel(
            image = R.drawable.onboarding,
            txt =R.string.text_splash_first_frament,
        ),
        WorkoutModel(
            image = R.drawable.onoardinguc,
            txt = R.string.text_splash_first_frament,
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPagerFirst.adapter = WorkoutViewPagerAdapt(workoutList2)
        binding.indicator.attachTo(binding.viewPagerFirst)


        binding.button.setOnClickListener {
            // Get the current item index
            val currentItem = binding.viewPagerFirst.currentItem

            // Check if there is a next item
            if (currentItem < workoutList2.size - 1) {
                // Move to the next item
                binding.viewPagerFirst.setCurrentItem(currentItem + 1, true)
            } else {

            }
        }

    }


}