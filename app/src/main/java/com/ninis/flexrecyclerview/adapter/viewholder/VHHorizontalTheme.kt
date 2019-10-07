package com.ninis.flexrecyclerview.adapter.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.ninis.databindingrecyclerview.util.BindingAdapterUtil
import com.ninis.flexrecyclerview.R
import com.ninis.flexrecyclerview.base.BaseViewHolder
import com.ninis.flexrecyclerview.data.HorizontalThemeModel
import kotlinx.android.synthetic.main.vh_horizontal_theme.view.*
import kotlinx.android.synthetic.main.vh_horizontal_theme_item.view.*

class VHHorizontalTheme(itemView: View) : BaseViewHolder<HorizontalThemeModel>(itemView) {

    private val horizontalLayoutManager: LinearLayoutManager by lazy {
        LinearLayoutManager(itemView.context)
    }

    private val themeAdapter: ThemeAdapter by lazy {
        ThemeAdapter()
    }

    private val itemDecoration: DividerItemDecoration by lazy {
        DividerItemDecoration(itemView.context, DividerItemDecoration.HORIZONTAL)
    }

    init {
        setRecyclerView()
    }

    override fun onBindView(model: HorizontalThemeModel) {
        itemView.tv_item_type.text = model.itemType

        themeAdapter.setThemeItems(model.themes)
    }

    private fun setRecyclerView() {
        itemView.rv_horizontal_theme.apply {
            horizontalLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
            layoutManager = horizontalLayoutManager
            adapter = themeAdapter
        }
    }

    class ThemeAdapter: RecyclerView.Adapter<ThemeViewHolder>() {

        val themeItems = ArrayList<HorizontalThemeModel.ThemeItemModel>()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThemeViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.vh_horizontal_theme_item, parent, false)
            return ThemeViewHolder(itemView)
        }

        override fun getItemCount(): Int {
            return themeItems.size
        }

        override fun onBindViewHolder(holder: ThemeViewHolder, position: Int) {
            holder.onBindView(themeItems[position])
        }

        fun setThemeItems(items: ArrayList<HorizontalThemeModel.ThemeItemModel>) {
            if( themeItems.isNotEmpty() )
                themeItems.clear()
            themeItems.addAll(items)
            notifyDataSetChanged()
        }
    }

    class ThemeViewHolder(itemView: View) : BaseViewHolder<HorizontalThemeModel.ThemeItemModel>(itemView) {
        override fun onBindView(model: HorizontalThemeModel.ThemeItemModel) {
            itemView.tv_theme_item_title.text = model.title

            BindingAdapterUtil.loadImgUrl(
                itemView.iv_theme_item_logo,
                model.coverImageUrl
            )
        }
    }
}