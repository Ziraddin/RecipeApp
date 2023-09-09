package com.zireddinismayilov.recipeapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zireddinismayilov.recipeapp.api.ApiService
import com.zireddinismayilov.recipeapp.model.Categories
import com.zireddinismayilov.recipeapp.model.Category
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CategoryViewModel : ViewModel() {

    private val _categories = MutableLiveData<List<Category>>()
    val categories: LiveData<List<Category>> = _categories

    init {
        fetchDataFromApi()
    }

    private fun fetchDataFromApi() {
        val apiService = ApiService.create()
        val call = apiService.getCategories()

        call.enqueue(object : Callback<Categories> {
            override fun onResponse(call: Call<Categories>, response: Response<Categories>) {
                if (response.isSuccessful) {
                    val categories = response.body()?.categories ?: emptyList()
                    _categories.postValue(categories)
                }
            }

            override fun onFailure(call: Call<Categories>, t: Throwable) {
                // Handle failure
            }
        })
    }
}
