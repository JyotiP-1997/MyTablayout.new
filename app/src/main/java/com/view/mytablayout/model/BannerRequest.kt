package com.view.mytablayout.model

import com.google.gson.annotations.SerializedName

data class BannerRequest(

	@field:SerializedName("userLocation")
	val userLocation: UserLocation? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("userId")
	val userId: String? = null
)

data class UserLocation(

	@field:SerializedName("coordinates")
	val coordinates: List<Double?>? = null,

	@field:SerializedName("type")
	val type: String? = null
)
