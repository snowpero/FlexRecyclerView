package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.ReviewItemModel
import kotlinx.android.synthetic.main.vh_review.view.*

class VHReview(itemView: View) : BaseViewHolder<ReviewItemModel>(itemView) {
    override fun onBindView(model: ReviewItemModel) {
        itemView.tv_item_type.text = model.itemType
    }
}