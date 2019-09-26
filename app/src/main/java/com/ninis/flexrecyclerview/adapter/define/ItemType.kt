package com.ninis.flexrecyclerview.adapter.define

import android.view.View
import com.ninis.flexrecyclerview.R
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.adapter.viewholder.*
import com.ninis.flexrecyclerview.base.BaseItemModel
import com.ninis.flexrecyclerview.data.*
import kotlin.reflect.KClass

enum class ItemType(val model: KClass<out BaseItemModel>, val viewHolder: KClass<out BaseViewHolder<*>>, val xmlId: Int) {
    TEXT_ITEM(
        TextItemModel::class,
        VHNotSupport::class,
        R.layout.vh_text_item
    ),
    IMAGE_ITEM(
        ImageItemModel::class,
        VHImageItem::class,
        R.layout.vh_image_item
    ),
    NOT_SUPPORT(
        BaseItemModel::class,
        BaseViewHolder::class,
        R.layout.vh_not_support
    ),
    CELL_TYPE_COMPANY(
        CompanyItemModel::class,
        VHCompany::class,
        R.layout.vh_company
    ),
    CELL_TYPE_HORIZONTAL_THEME(
        HorizontalThemeModel::class,
        VHHorizontalTheme::class,
        R.layout.vh_horizontal_theme
    ),
    CELL_TYPE_JOB_POSTING(
        JobPostingItemModel::class,
        VHJobPosting::class,
        R.layout.vh_job_posting
    ),
    CELL_TYPE_REVIEW(
        ReviewItemModel::class,
        VHReview::class,
        R.layout.vh_review
    ),
    CELL_TYPE_SALARY(
        SalaryItemModel::class,
        VHSalary::class,
        R.layout.vh_salary
    ),
    CELL_TYPE_INTERVIEW(
        InterviewItemModel::class,
        VHInterview::class,
        R.layout.vh_interview
    )
    ;

    fun newInstanceViewHolder(view: View): BaseViewHolder<*> {
        return viewHolder.constructors.first().call(view)
    }
}