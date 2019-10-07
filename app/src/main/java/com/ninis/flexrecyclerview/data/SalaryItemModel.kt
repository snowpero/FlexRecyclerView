package com.ninis.flexrecyclerview.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ninis.flexrecyclerview.base.BaseItemModel

data class SalaryItemModel(
    @SerializedName("name") @Expose
    val name: String,
    @SerializedName("logo_path") @Expose
    val logoPath: String,
    @SerializedName("industry_name") @Expose
    val industryName: String,
    @SerializedName("rate_total_avg") @Expose
    val rateTotalAvg: Float,
    @SerializedName("simple_desc") @Expose
    val desc: String
) : BaseItemModel()