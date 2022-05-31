package com.view.mytablayout.controllers.Services

import com.google.gson.JsonObject
import com.view.mytablayout.controllers.Utils.Constants
import com.view.mytablayout.model.BannerResponse

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface APIInterface{

    @Headers("Content-Type: application/json; charset=utf-8")
    @POST(Constants.API_BANNER)
    fun getbannerapi(
        @Body request: JsonObject
    ): Call<BannerResponse>?

}