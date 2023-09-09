package com.zireddinismayilov.recipeapp.model


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("idCategory")
    val id: String,
    @SerializedName("strCategory")
    val strCategory: String,
)

