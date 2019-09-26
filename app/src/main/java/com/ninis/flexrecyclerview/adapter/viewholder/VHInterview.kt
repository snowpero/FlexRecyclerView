package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.InterviewItemModel
import kotlinx.android.synthetic.main.vh_interview.view.*

class VHInterview(itemView: View) : BaseViewHolder<InterviewItemModel>(itemView) {
    override fun onBindView(model: InterviewItemModel) {
        itemView.tv_item_type.text = model.itemType
    }
}