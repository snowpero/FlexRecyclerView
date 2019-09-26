package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.JobPostingItemModel
import kotlinx.android.synthetic.main.vh_job_posting.view.*


class VHJobPosting(itemView: View) : BaseViewHolder<JobPostingItemModel>(itemView) {
    override fun onBindView(model: JobPostingItemModel) {
        itemView.tv_item_type.text = model.itemType
    }
}