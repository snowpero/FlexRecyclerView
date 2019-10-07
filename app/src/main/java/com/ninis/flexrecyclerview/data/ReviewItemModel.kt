package com.ninis.flexrecyclerview.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ninis.flexrecyclerview.base.BaseItemModel

data class ReviewItemModel(
    @SerializedName("name") @Expose
    val name: String,
    @SerializedName("logo_path") @Expose
    val logoPath: String,
    @SerializedName("industry_name") @Expose
    val industryName: String,
    @SerializedName("occupation_name") @Expose
    val occupationName: String,
    @SerializedName("review_summary") @Expose
    val reviewSummary: String,
    @SerializedName("pros") @Expose
    val pros: String,
    @SerializedName("cons") @Expose
    val cons: String
): BaseItemModel()