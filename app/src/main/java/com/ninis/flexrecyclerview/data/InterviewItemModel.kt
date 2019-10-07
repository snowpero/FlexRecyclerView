package com.ninis.flexrecyclerview.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ninis.flexrecyclerview.base.BaseItemModel

data class InterviewItemModel(
    @SerializedName("name") @Expose
    val companyName: String,
    @SerializedName("logo_path") @Expose
    val logoPathUrl: String,
    @SerializedName("industry_name") @Expose
    val industryName: String,
    @SerializedName("simple_desc") @Expose
    val simpleDesc: String,
    @SerializedName("interview_summary") @Expose
    val summary: String,
    @SerializedName("interview_desc") @Expose
    val desc: String,
    @SerializedName("interview_question") @Expose
    val question: String
) : BaseItemModel()