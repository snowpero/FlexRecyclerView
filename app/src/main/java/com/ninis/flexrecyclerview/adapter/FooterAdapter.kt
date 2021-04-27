package com.ninis.flexrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ninis.flexrecyclerview.R

class FooterAdapter: RecyclerView.Adapter<FooterAdapter.FooterViewHolder>() {
    inner class FooterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FooterViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.vh_footer_item, parent, false)
        return FooterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FooterViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 1
    }
}