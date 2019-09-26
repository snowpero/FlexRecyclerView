package com.ninis.flexrecyclerview.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ninis.flexrecyclerview.adapter.define.ItemType
import com.ninis.flexrecyclerview.base.BaseItemModel

data class ImageItemModel(
    @SerializedName("id") @Expose
    var id: Int = ItemType.TEXT_ITEM.ordinal
): BaseItemModel() {
    init {
        type = ItemType.IMAGE_ITEM

    }
}