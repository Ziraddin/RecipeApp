package com.zireddinismayilov.recipeapp.api

import com.zireddinismayilov.recipeapp.model.Categories
import com.zireddinismayilov.recipeapp.model.MealItems
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    // Define a function to get categories from the API
    @GET("json/v1/1/categories.php")
    fun getCategories(): Call<Categories>


    @GET("json/v1/1/filter.php")
    fun getMealsByCategory(@Query("a") category: String): Call<MealItems>

    @GET("json/v1/1/search.php")
    fun searchMealsByName(@Query("f") name: String): Call<MealItems>

    companion object {
        // Base URL of the API
        private const val BASE_URL = "https://www.themealdb.com/api/"

        // Create a Retrofit instance
        fun create(): ApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(ApiService::class.java)
        }
    }
}
