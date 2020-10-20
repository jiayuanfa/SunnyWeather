package com.example.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweather.logic.Place
import com.example.sunnyweather.logic.Repository
import retrofit2.Response

class PlaceViewModel : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    /**
     * 观察Live Data searchLiveData 发生变化就获取一次数据并转换给外界使用
     * switchMap函数是为了转换外生成的LiveData对象 标准写法
     */
    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
}