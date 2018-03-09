package com.rosie.ponies

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.list_item.view.*

class PonyViewHolderBlack(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val ponyTextView: TextView

    init {
        ponyTextView = itemView.ponyname
        itemView.setBackgroundColor(itemView.resources.getColor(R.color.dark))
    }
}