package com.example.indolive.data.network

import com.example.indolive.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/cnn/terbaru/")
    fun getCnnTerbaruNews(
        @Query("q") q:String = "terbaru",
        @Query("language") language:String = "id",
        @Query("pageSize") pageSize : Int = 10,
    ): Call<NewsResponse>

    @GET("/cnn/nasional/")
    fun getCnnNasionalNews(
        @Query("q") q:String = "nasional",
        @Query("language") language:String = "id",
        @Query("pageSize") pageSize : Int = 10,
    ): Call<NewsResponse>

    @GET("/cnn/internasional/")
    fun getCnnInternasionalNews(
        @Query("q") q:String = "internasional",
        @Query("language") language:String = "id",
        @Query("pageSize") pageSize : Int = 10,
    ): Call<NewsResponse>

    @GET("/republika/terbaru/")
    fun getMerdekaTerbaruNews(
        @Query("q") q:String = "terbaru",
        @Query("language") language:String = "id",
        @Query("pageSize") pageSize : Int = 10,
    ): Call<NewsResponse>

    @GET("/republika/bola/")
    fun getMerdekaJakartaNews(
        @Query("q") q:String = "bola",
        @Query("language") language:String = "id",
        @Query("pageSize") pageSize : Int = 10,
    ): Call<NewsResponse>

    @GET("/republika/internasional/")
    fun getMerdekaDuniaNews(
        @Query("q") q:String = "internasional",
        @Query("language") language:String = "en",
        @Query("pageSize") pageSize : Int = 10,
    ): Call<NewsResponse>

    @GET("/okezone/terbaru/")
    fun getOkezoneTerbaruNews(
        @Query("q") q:String = "terbaru",
        @Query("language") language:String = "en",
        @Query("pageSize") pageSize : Int = 10,
    ): Call<NewsResponse>

    @GET("/okezone/celebrity/")
    fun getOkezoneCelebrityNews(
        @Query("q") q:String = "celebrity",
        @Query("language") language:String = "en",
        @Query("pageSize") pageSize : Int = 10,
    ): Call<NewsResponse>

    @GET("/okezone/sports/")
    fun getOkezoneSportNews(
        @Query("q") q:String = "sports",
        @Query("language") language:String = "en",
        @Query("pageSize") pageSize : Int = 10,
    ): Call<NewsResponse>
}