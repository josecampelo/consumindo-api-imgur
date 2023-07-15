package com.campelo.consumindoapiimgur.api.model

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()

        val request = requestBuilder.addHeader(
            "Authorization", "Client-ID ed5a19e81fe7828"
        ).build()

        return chain.proceed(request)
    }
}