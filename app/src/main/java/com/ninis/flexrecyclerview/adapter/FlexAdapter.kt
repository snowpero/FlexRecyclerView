package com.ninis.flexrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ninis.flexrecyclerview.adapter.define.ItemType
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.base.BaseItemModel
import kotlinx.android.synthetic.main.vh_review.view.*
import kotlinx.android.synthetic.main.vh_text_item.view.*
import java.util.*

class FlexAdapter: RecyclerView.Adapter<BaseViewHolder<*>>() {
    var items = LinkedList<Any>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val type = ItemType.values()[viewType]
        val itemView = LayoutInflater.from(parent.context).inflate(type.xmlId, parent, false)

        return type.newInstanceViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        (holder as BaseViewHolder<Any>).onBindView(items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return if (items.isEmpty()) -1 else (items[position] as BaseItemModel).type.ordinal
    }
}