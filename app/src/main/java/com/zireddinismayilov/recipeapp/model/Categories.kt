package com.zireddinismayilov.recipeapp.model

import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("categories")
    val categories: List<Category>
)
