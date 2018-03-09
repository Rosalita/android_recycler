package com.rosie.ponies

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PonyAdaptor(private val ponylist: ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        Log.d("TAG", "in onCreateViewHolder")

        return if (viewType == 0){
            PonyViewHolderWhite(view)
        } else {
            PonyViewHolderBlack(view)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position % 2 == 0){
            0
        } else {
            1
        }
    }

    override fun getItemCount(): Int {
        val size = ponylist.size
        Log.d("TAG", "count $size")
        return size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val pony = ponylist[position]
        when(holder.itemViewType){
            0 -> {(holder as PonyViewHolderWhite).ponyTextView.text = pony }
            1 -> {(holder as PonyViewHolderBlack).ponyTextView.text = pony }
        }

        Log.d("TAG", "bind $position")
    }

}