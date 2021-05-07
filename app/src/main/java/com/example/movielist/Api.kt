package com.example.movielist

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "f28224ccc2569014f0d272b68b329065",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}