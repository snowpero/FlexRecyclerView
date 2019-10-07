package com.ninis.databindingrecyclerview.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ninis.flexrecyclerview.adapter.FlexAdapter
import com.ninis.flexrecyclerview.base.BaseItemModel
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation
import java.util.*
import kotlin.collections.ArrayList

class BindingAdapterUtil {

    companion object {
        @BindingAdapter("loadImgUrl")
        @JvmStatic
        fun loadImgUrl(view: ImageView, url: String?) {
            Picasso.get()
                .load(url)
                .into(view)
        }

        @BindingAdapter("loadImgUrlThumbnail")
        @JvmStatic
        fun loadImgUrlThumbnail(view: ImageView, url: String?, thumbNailUrl: String?) {
            Picasso.get()
                .load(thumbNailUrl)
                .into(view, object : Callback {
                    override fun onSuccess() {
                        Picasso.get()
                            .load(url)
                            .into(view)
                    }

                    override fun onError(e: Exception?) {

                    }
                })
        }

        @BindingAdapter("loadImgUrlRounded")
        @JvmStatic
        fun loadImgUrlRounded(view: ImageView, url: String?) {
            Picasso.get()
                .load(url)
                .transform(RoundedCornersTransformation(10, 0, RoundedCornersTransformation.CornerType.ALL))
                .into(view)
        }

        @BindingAdapter("loadImgUrlCircle")
        @JvmStatic
        fun loadImgUrlCircle(view: ImageView, url: String?) {
            Picasso.get()
                .load(url)
                .transform(CropCircleTransformation())
                .into(view)
        }

        @BindingAdapter("setListItems")
        @JvmStatic
        fun setListItems(view: RecyclerView, items: ArrayList<BaseItemModel>?) {
            items?.let {
                val adapter =
                    view.adapter as? FlexAdapter ?: FlexAdapter().apply { view.adapter = this }
                adapter.items = LinkedList(it)
                adapter.notifyDataSetChanged()
            }
        }
    }
}