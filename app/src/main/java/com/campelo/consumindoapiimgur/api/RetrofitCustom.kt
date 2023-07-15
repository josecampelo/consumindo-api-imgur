package com.campelo.consumindoapiimgur.api

import com.campelo.consumindoapiimgur.api.model.AuthInterceptor
import com.campelo.consumindoapiimgur.api.model.ImgurAPI
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitCustom {

    val imgurAPI by lazy {
        //https://api.imgur.com/3/gallery/search/?q=cats
        Retrofit.Builder()
            .baseUrl("https://api.imgur.com/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(
                OkHttpClient.Builder().addInterceptor(AuthInterceptor()).build()
            )
            .build()
            .create(ImgurAPI::class.java)
    }
}