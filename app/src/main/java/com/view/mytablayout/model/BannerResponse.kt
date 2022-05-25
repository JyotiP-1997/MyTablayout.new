package com.view.mytablayout.model

import com.google.gson.annotations.SerializedName

data class BannerResponse(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("statusCode")
	val statusCode: Int? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class Store(

	@field:SerializedName("storeImage")
	val storeImage: String? = null,

	@field:SerializedName("zipCode")
	val zipCode: String? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("distance")
	val distance: Double? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("mobileNumber")
	val mobileNumber: String? = null,

	@field:SerializedName("nameWithoutSpace")
	val nameWithoutSpace: String? = null,

	@field:SerializedName("token")
	val token: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("storeLocation")
	val storeLocation: StoreLocation? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("avgRating")
	val avgRating: Int? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class StoreLocation(

	@field:SerializedName("coordinates")
	val coordinates: List<Double?>? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class BannersItem(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("bannerImage")
	val bannerImage: String? = null,

	@field:SerializedName("titleWithoutSpace")
	val titleWithoutSpace: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("storeId")
	val storeId: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class ImagesItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("hexCode")
	val hexCode: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("index")
	val index: Int? = null,

	@field:SerializedName("_id")
	val id: String? = null
)

data class Data(

	@field:SerializedName("newProducts")
	val newProducts: List<NewProductsItem?>? = null,

	@field:SerializedName("featuredProducts")
	val featuredProducts: List<FeaturedProductsItem?>? = null,

	@field:SerializedName("store")
	val store: Store? = null,

	@field:SerializedName("categories")
	val categories: List<CategoriesItem?>? = null,

	@field:SerializedName("banners")
	val banners: List<BannersItem?>? = null
)

data class CategoriesItem(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("nameWithoutSpace")
	val nameWithoutSpace: String? = null,

	@field:SerializedName("storeId")
	val storeId: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class ProductId(

	@field:SerializedName("images")
	val images: List<ImagesItem?>? = null,

	@field:SerializedName("quantity")
	val quantity: Int? = null,

	@field:SerializedName("price")
	val price: Double? = null,

	@field:SerializedName("companyName")
	val companyName: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("isWish")
	val isWish: String? = null
)

data class NewProductsItem(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("productId")
	val productId: ProductId? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("storeId")
	val storeId: String? = null,

	@field:SerializedName("categoryId")
	val categoryId: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class FeaturedProductsItem(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("productId")
	val productId: ProductId? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("storeId")
	val storeId: String? = null,

	@field:SerializedName("categoryId")
	val categoryId: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)
