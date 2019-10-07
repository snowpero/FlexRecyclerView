package com.ninis.flexrecyclerview.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ninis.flexrecyclerview.base.BaseItemModel

data class HorizontalThemeModel(
    @SerializedName("count") @Expose
    val count: Int,
    @SerializedName("themes") @Expose
    val themes: ArrayList<ThemeItemModel>
) : BaseItemModel() {
    data class ThemeItemModel(
        @SerializedName("color") @Expose
        val color: String,
        @SerializedName("cover_image") @Expose
        val coverImageUrl: String,
        @SerializedName("id") @Expose
        val id: Int,
        @SerializedName("title") @Expose
        val title: String
    ) : BaseItemModel()
}