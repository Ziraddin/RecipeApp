package com.zireddinismayilov.recipeapp.model

import com.google.gson.annotations.SerializedName

data class MealItems(
    @SerializedName("meals")
    val meals: List<MealItem>?
)
