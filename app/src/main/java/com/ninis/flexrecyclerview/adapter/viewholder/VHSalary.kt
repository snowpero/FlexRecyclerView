package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.flexrecyclerview.base.BaseItemModel
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.SalaryItemModel
import kotlinx.android.synthetic.main.vh_review.view.*

class VHSalary(itemView: View) : BaseViewHolder<SalaryItemModel>(itemView) {
    override fun onBindView(model: SalaryItemModel) {
        itemView.tv_item_type.text = model.itemType
    }
}