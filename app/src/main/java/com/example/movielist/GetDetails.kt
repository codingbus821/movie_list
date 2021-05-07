package com.example.movielist

import com.google.gson.annotations.SerializedName

data class GetDetails(
    @SerializedName("results") val genres: List<MovieDetail>
)