package com.example.sunnyweather.logic

import com.google.gson.annotations.SerializedName

/**
 * 根据接口，定义我们想要的数据模型
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location,
                @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)