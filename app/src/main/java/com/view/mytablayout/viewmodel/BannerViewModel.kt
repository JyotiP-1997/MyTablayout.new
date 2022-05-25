package com.view.mytablayout.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.view.mytablayout.controllers.Services.APIRepository
import com.view.mytablayout.model.BannerResponse
import org.json.JSONArray
import org.json.JSONObject

class BannerViewModel: AndroidViewModel{

    private  lateinit var context: Context


    constructor(application: Application) : super(application) {

        this.context = application
    }

    fun getbanner(store_Id: String): LiveData<BannerResponse>
    {
        var mutableLiveData: MutableLiveData<BannerResponse> = MutableLiveData()
        when {
//            username.isEmpty() -> {
//          //      mutableLiveData.value =
//                  //  APIResponse<String>().error(Exception(context.getString(R.string.error_empty_user_id)))
//            }
//            password.isEmpty() -> {
////                mutableLiveData.value =
////                    APIResponse<String>().error(Exception(context.getString(R.string.error_empty_password)))
//            }
            else -> {
                val mcoordinateList = ArrayList<Double>()
                mcoordinateList.add(30.7143)
                mcoordinateList.add(76.7011)
                val obj= JSONObject()
                val details= JSONObject()
                obj.put("type","all")
                obj.put("userId","6123ef78a53aadaa20e45e52")
                details.put("type","all")
                details.put("coordinates", JSONArray(mcoordinateList))
                obj.put("userLocation",details)
                val jsonParser = JsonParser()
                val jsonObject = jsonParser.parse(obj.toString()) as JsonObject
                return APIRepository.banner(jsonObject)

            }
        }
        return mutableLiveData
    }

    }
