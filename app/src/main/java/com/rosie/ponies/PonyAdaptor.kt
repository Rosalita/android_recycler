package com.rosie.ponies

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup

class PonyAdaptor(private val ponylist: ArrayList<String>) : RecyclerView.Adapter<PonyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PonyViewHolder {
        val view = View.inflate(parent.context, R.layout.list_item, null)
        Log.d("TAG", "in onCreateViewHolder")
        return PonyViewHolder(view)
    }

    override fun getItemCount(): Int {
        val size = ponylist.size
        Log.d("TAG", "count $size")
        return size
    }

    override fun onBindViewHolder(holder: PonyViewHolder, position: Int) {
        val pony = ponylist[position]
        holder.ponyTextView.text = pony
        Log.d("TAG", "bind $position")
    }

}