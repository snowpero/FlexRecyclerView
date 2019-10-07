package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.databindingrecyclerview.util.BindingAdapterUtil
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.InterviewItemModel
import kotlinx.android.synthetic.main.vh_interview.view.*

class VHInterview(itemView: View) : BaseViewHolder<InterviewItemModel>(itemView) {
    override fun onBindView(model: InterviewItemModel) {
        itemView.tv_item_type.text = model.itemType

        itemView.tv_interview_company_name.text = model.companyName

        BindingAdapterUtil.loadImgUrlCircle(
            itemView.iv_interview_company_logo,
            model.logoPathUrl
        )

        itemView.tv_interview_company_name.text = model.companyName
        itemView.tv_interview_summary.text = model.summary
        itemView.tv_interview_desc.text = model.desc
        itemView.tv_interview_question.text = model.question
    }
}