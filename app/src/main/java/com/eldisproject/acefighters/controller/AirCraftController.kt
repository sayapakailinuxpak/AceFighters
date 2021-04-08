package com.eldisproject.acefighters.controller

import android.content.Context
import android.util.Log
import com.eldisproject.acefighters.data.AirCraft
import com.eldisproject.acefighters.data.DataSource
import com.eldisproject.acefighters.ui.MainActivity
import com.eldisproject.acefighters.ui.RecyclerAirCraftAdapter

class AirCraftController {
    private lateinit var view: MainActivity
    private lateinit var adapter: RecyclerAirCraftAdapter

    companion object {
        private const val TAG = "AirCraftController"
    }

    fun injectViewAndAdapter(view: MainActivity, adapter: RecyclerAirCraftAdapter) {
        this.view = view
        this.adapter = adapter
        fetchAllAirCraft(this.view)
    }

    private fun fetchAllAirCraft(context: Context) {
        this.view.setDataToAdapter(adapter, DataSource.getAllAirCrafts(context))
        Log.d(TAG, "fetchAllAirCraft: invoked!")
    }
}