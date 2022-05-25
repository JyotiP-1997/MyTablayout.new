package com.view.mytablayout.controllers.Services


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.gender.gendercomfortable.controller.repository.APIClient
import com.google.gson.JsonObject
import com.view.mytablayout.controllers.Utils.Constants
import com.view.mytablayout.model.BannerResponse
import com.view.mytablayout.model.BannersItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


object APIRepository{

    private var apiInterface: APIInterface = APIClient.retrofit(Constants.BASE_URL_API)

    private var bannerList: ArrayList<BannersItem>?= ArrayList()

    fun banner (request: JsonObject): LiveData<BannerResponse>
    {
        val mutableLiveData: MutableLiveData<BannerResponse> = MutableLiveData()
        val call = apiInterface.getbannerapi(request)
        call?.enqueue(object : Callback<BannerResponse>
        {
            override fun onResponse(call: Call<BannerResponse>,response: Response<BannerResponse>
            ) {
                if (response.isSuccessful) {
                    try {
                        val bannerResponse: BannerResponse? = response.body()
                        Log.e("msg", bannerResponse?.data?.banners.toString())
                       bannerList = bannerResponse?.data?.banners as ArrayList<BannersItem>
                        mutableLiveData.value = bannerResponse
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                } else {
                }
            }

            override fun onFailure(call: Call<BannerResponse>, t: Throwable) {
                t.printStackTrace()
                Log.e("error", t.message + "ABC")

            }
        })

        return mutableLiveData
    }



}
