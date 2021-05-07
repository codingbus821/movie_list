package com.example.movielist

import android.content.res.Resources
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = BuildConfig.movieapi,
        @Query("language") language: String = "ko-KR",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = BuildConfig.movieapi,
        @Query("language") language: String = "ko-KR",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = BuildConfig.movieapi,
        @Query("language") language: String = "ko-KR",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/now_playing")
    fun getNowMovies(
        @Query("api_key") apiKey: String = BuildConfig.movieapi,
        @Query("language") language: String = "ko-KR",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>


}