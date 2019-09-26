package com.ninis.flexrecyclerview.util

import com.google.gson.Gson
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.ninis.flexrecyclerview.adapter.define.ItemType
import com.ninis.flexrecyclerview.base.BaseItemModel
import java.lang.reflect.Type
import java.util.*
import kotlin.reflect.KClass

class ModelDeserializer: JsonDeserializer<BaseItemModel> {
    private val mapItemType = HashMap<String, ItemType>()
    private val DEFINE_ITEM_TYPE = "cell_type"
    private val DEFINE_CHILD_ITEMS_TYPE = "child_items"
    private val gson = Gson()

    init {
        for( type in ItemType.values() ) {
            mapItemType.put(type.name, type)
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): BaseItemModel {
        val jsonObject = json.asJsonObject
        var model: BaseItemModel = BaseItemModel()

        if( jsonObject.has(DEFINE_ITEM_TYPE) && !jsonObject.get(DEFINE_ITEM_TYPE).isJsonNull ) {
            val itemType = jsonObject.get(DEFINE_ITEM_TYPE).asString

            var classType = BaseItemModel::class
            var modelType = ItemType.NOT_SUPPORT
            if( mapItemType.containsKey(itemType) ) {
                mapItemType[itemType]?.let {
                    classType = it.model as KClass<BaseItemModel>
                    modelType = it
                }
            }

            model = gson.fromJson(json, classType.javaObjectType)
            model.type = modelType
        }

        return model
    }
}