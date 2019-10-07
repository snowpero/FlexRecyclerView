package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.databindingrecyclerview.util.BindingAdapterUtil
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.CompanyItemModel
import kotlinx.android.synthetic.main.vh_company.view.*
import kotlinx.android.synthetic.main.vh_review.view.tv_item_type

class VHCompany(itemView: View) : BaseViewHolder<CompanyItemModel>(itemView) {

    override fun onBindView(model: CompanyItemModel) {
        itemView.tv_item_type.text = model.itemType

        BindingAdapterUtil.loadImgUrlRounded(
            itemView.iv_company_logo,
            model.logoPath
        )
        itemView.tv_company_name.text = model.name
        itemView.tv_company_review.text = model.reviewSummary
        itemView.tv_company_interview.text = model.interviewQuestion
        itemView.tv_company_rating_value.text = model.rateTotalAvg.toString()
    }
}