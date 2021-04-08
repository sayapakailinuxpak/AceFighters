package com.eldisproject.acefighters.ui

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eldisproject.acefighters.data.AirCraft
import com.eldisproject.acefighters.databinding.AirCraftItemBinding

class RecyclerAirCraftAdapter(val onItemClickCallback: OnItemClickCallback) : RecyclerView.Adapter<RecyclerAirCraftAdapter.ViewHolder>() {
    private lateinit var airCraftList: List<AirCraft>

    companion object {
        private const val TAG = "RecyclerAirCraftAdapter"
    }

    fun setData(airCraftList: List<AirCraft>) {
        this.airCraftList = airCraftList
        notifyDataSetChanged()
        Log.d(TAG, "Adapter setData: invoked")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAirCraftAdapter.ViewHolder {
        val airCraftItemBinding = AirCraftItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(airCraftItemBinding, this.onItemClickCallback)
    }

    override fun onBindViewHolder(holder: RecyclerAirCraftAdapter.ViewHolder, position: Int) {
        val airCraft = airCraftList[position]
        Glide.with(holder.itemView.context)
                .load(airCraft.photoLink)
                .into(holder.airCraftItemBinding.imageAirCraftOnList)
        holder.airCraftItemBinding.textAirCraftNameOnList.text = airCraft.name
        holder.airCraftItemBinding.textAirCraftCodenameOnList.text = airCraft.codename
        Log.d(TAG, "onBindViewHolder: invoked!")
    }

    override fun getItemCount(): Int {
        return airCraftList.size
    }

    inner class ViewHolder(val airCraftItemBinding: AirCraftItemBinding, val onItemClickCallback: OnItemClickCallback): RecyclerView.ViewHolder(airCraftItemBinding.root) {

        init {
            this.airCraftItemBinding.root.setOnClickListener {
                this.onItemClickCallback.clickable(airCraftList[adapterPosition])
            }
        }

    }

    interface OnItemClickCallback {
        fun clickable(airCraft: AirCraft)
    }
}