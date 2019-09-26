package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.HorizontalThemeModel
import kotlinx.android.synthetic.main.vh_horizontal_theme.view.*

class VHHorizontalTheme(itemView: View) : BaseViewHolder<HorizontalThemeModel>(itemView) {
    override fun onBindView(model: HorizontalThemeModel) {
        itemView.tv_item_type.text = model.itemType
    }
}