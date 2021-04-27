package com.ninis.flexrecyclerview.network

import com.ninis.flexrecyclerview.data.ResponseModel
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ApiService {
    // https://firebasestorage.googleapis.com/v0/b/snowpero.appspot.com/o/jp_main.json?alt=media&token=3173af46-2ae8-4019-a32f-80b7d02e7143
    @GET("/v0/b/snowpero.appspot.com/o/jp_main.json?alt=media&token=3173af46-2ae8-4019-a32f-80b7d02e7143")
    fun getData(): Single<ResponseModel>
}