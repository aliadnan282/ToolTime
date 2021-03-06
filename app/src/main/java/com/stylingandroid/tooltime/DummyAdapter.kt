package com.stylingandroid.tooltime

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DummyAdapter(@LayoutRes private val layoutId: Int) : RecyclerView.Adapter<DummyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? =
        parent?.context?.run {
            LayoutInflater.from(this).run {
                inflate(layoutId, parent, false).let {
                    ViewHolder(it)
                }
            }
        }

    override fun getItemCount(): Int = 0

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
