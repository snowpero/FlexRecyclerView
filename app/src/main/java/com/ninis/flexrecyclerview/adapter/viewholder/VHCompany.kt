package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.flexrecyclerview.base.BaseItemModel
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.CompanyItemModel
import kotlinx.android.synthetic.main.vh_review.view.*

class VHCompany(itemView: View) : BaseViewHolder<CompanyItemModel>(itemView) {
    override fun onBindView(model: CompanyItemModel) {
        itemView.tv_item_type.text = model.itemType
    }
}