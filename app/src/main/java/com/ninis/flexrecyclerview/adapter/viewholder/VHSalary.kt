package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.View
import com.ninis.databindingrecyclerview.util.BindingAdapterUtil
import com.ninis.flexrecyclerview.base.BaseItemModel
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.SalaryItemModel
import kotlinx.android.synthetic.main.vh_review.view.*
import kotlinx.android.synthetic.main.vh_review.view.tv_item_type
import kotlinx.android.synthetic.main.vh_salary.view.*

class VHSalary(itemView: View) : BaseViewHolder<SalaryItemModel>(itemView) {
    override fun onBindView(model: SalaryItemModel) {
        itemView.tv_item_type.text = model.itemType

        itemView.tv_salary_company_name.text = model.name
        itemView.tv_salary_avg.text = model.rateTotalAvg.toString()

        BindingAdapterUtil.loadImgUrlRounded(
            itemView.iv_salary_company_logo,
            model.logoPath
        )

        itemView.tv_salary_industry_name.text = model.industryName
        itemView.tv_salary_desc.text = model.desc
    }
}