package com.example.movielist

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "f28224ccc2569014f0d272b68b329065",
        @Query("language") language: String = "ko-KR",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "f28224ccc2569014f0d272b68b329065",
        @Query("language") language: String = "ko-KR",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "f28224ccc2569014f0d272b68b329065",
        @Query("language") language: String = "ko-KR",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}