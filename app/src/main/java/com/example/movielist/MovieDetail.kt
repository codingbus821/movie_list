package com.example.movielist

import com.google.gson.annotations.SerializedName

data class MovieDetail(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val title: String
)