package com.ninis.flexrecyclerview.base

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.ninis.flexrecyclerview.adapter.define.ItemType

open class BaseItemModel(
    @SerializedName("cell_type") @Expose
    var itemType: String = ItemType.NOT_SUPPORT.name,
    var type: ItemType = ItemType.NOT_SUPPORT
)