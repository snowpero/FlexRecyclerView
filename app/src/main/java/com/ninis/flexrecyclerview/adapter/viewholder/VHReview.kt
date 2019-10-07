package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.databindingrecyclerview.util.BindingAdapterUtil
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.ReviewItemModel
import kotlinx.android.synthetic.main.vh_review.view.*

class VHReview(itemView: View) : BaseViewHolder<ReviewItemModel>(itemView) {
    override fun onBindView(model: ReviewItemModel) {
        itemView.tv_item_type.text = model.itemType

        itemView.tv_review_company_name.text = model.name
        itemView.tv_review_summary.text = model.reviewSummary

        BindingAdapterUtil.loadImgUrlCircle(
            itemView.iv_review_company_logo,
            model.logoPath
        )

        itemView.tv_review_cons.text = model.cons
        itemView.tv_review_pros.text = model.pros
    }
}