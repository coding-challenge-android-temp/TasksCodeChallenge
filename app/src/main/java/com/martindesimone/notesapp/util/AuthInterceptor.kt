package com.martindesimone.notesapp

import android.content.SharedPreferences
import okhttp3.Interceptor
import okhttp3.Response


class AuthInterceptor(val preferences: SharedPreferences): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Authorization",  preferences.getString("AUTH_TOKEN", "")!!)
            .build()

        return chain.proceed(request)
    }
}