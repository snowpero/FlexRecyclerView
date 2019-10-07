package com.ninis.flexrecyclerview.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ninis.flexrecyclerview.base.BaseItemModel

data class JobPostingItemModel(
    @SerializedName("id") @Expose
    val id: Int,
    @SerializedName("title") @Expose
    val title: String,
    @SerializedName("company_name") @Expose
    val companyName: String,
    @SerializedName("deadline") @Expose
    val deadline: DeadLineModel,
    @SerializedName("logo") @Expose
    val logo: String,
    @SerializedName("review_avg_cache") @Expose
    val reviewAvg: Float
) : BaseItemModel() {
    data class DeadLineModel(
        @SerializedName("type") @Expose
        val type: String,
        @SerializedName("message") @Expose
        val message: String,
        @SerializedName("color") @Expose
        val color: String,
        @SerializedName("hex_color") @Expose
        val hexColor: String
    )
}