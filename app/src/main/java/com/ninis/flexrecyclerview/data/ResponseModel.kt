package com.ninis.flexrecyclerview.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ninis.flexrecyclerview.base.BaseItemModel

data class ResponseModel(
    @SerializedName("total_count") @Expose
    val totalCount: Int,
    @SerializedName("items") @Expose
    val items: ArrayList<BaseItemModel>
)