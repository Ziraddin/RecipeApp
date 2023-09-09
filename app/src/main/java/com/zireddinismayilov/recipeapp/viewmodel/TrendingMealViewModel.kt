package com.zireddinismayilov.recipeapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zireddinismayilov.recipeapp.api.ApiService
import com.zireddinismayilov.recipeapp.model.MealItem
import com.zireddinismayilov.recipeapp.model.MealItems
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TrendingMealViewModel : ViewModel() {

    private val _meals = MutableLiveData<List<MealItem>>()
    val meals: LiveData<List<MealItem>> = _meals

    init {
        fetchDataFromApi()
    }

    private fun fetchDataFromApi() {
        val apiService = ApiService.create()
        val call = apiService.getMealsByCategory("Polish")

        call.enqueue(object : Callback<MealItems> {
            override fun onResponse(call: Call<MealItems>, response: Response<MealItems>) {
                if (response.isSuccessful) {
                    val meals = response.body()?.meals ?: emptyList()
                    _meals.postValue(meals)
                }
            }

            override fun onFailure(call: Call<MealItems>, t: Throwable) {
                // Handle failure
            }
        })
    }

}
