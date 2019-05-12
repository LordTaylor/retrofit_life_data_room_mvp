package com.lordtaylor.retrofit_life_data_room_mvp.ui.lists

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordtaylor.retrofit_life_data_room_mvp.R

class ListBaseAdapter : RecyclerView.Adapter<ListBaseAdapter.ItemViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.pin_item, parent, false))
    }

    override fun getItemCount(): Int {
        return 0
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.onBind()
    }


    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun onBind() {

        }

    }
}