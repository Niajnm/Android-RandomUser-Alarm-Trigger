package com.example.randomuser

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient{

    private const val BASE_URL = "https://newsapi.org/"
    private val gson = GsonBuilder().setLenient().create()

    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun getClient(): Retrofit {
        return retrofit
    }
}