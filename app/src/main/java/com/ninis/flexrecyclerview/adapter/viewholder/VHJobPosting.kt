package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.databindingrecyclerview.util.BindingAdapterUtil
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.JobPostingItemModel
import kotlinx.android.synthetic.main.vh_job_posting.view.*


class VHJobPosting(itemView: View) : BaseViewHolder<JobPostingItemModel>(itemView) {
    override fun onBindView(model: JobPostingItemModel) {
        itemView.tv_item_type.text = model.itemType

        itemView.tv_job_posting_company_name.text = model.companyName
        itemView.tv_job_posting_status.text = model.deadline.message

        BindingAdapterUtil.loadImgUrl(
            itemView.iv_job_posting_company_logo,
            model.logo
        )

        itemView.tv_job_posting_title.text = model.title
    }
}