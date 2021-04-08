package com.eldisproject.acefighters.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginTop
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.eldisproject.acefighters.R
import com.eldisproject.acefighters.controller.AirCraftController
import com.eldisproject.acefighters.data.AirCraft
import com.eldisproject.acefighters.data.DataSource
import com.eldisproject.acefighters.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity(), RecyclerAirCraftAdapter.OnItemClickCallback {
    private lateinit var binding: ActivityMainBinding
//    private var airCrafts: List<AirCraft> = ArrayList()

    private var airCrafts: ArrayList<AirCraft> = arrayListOf()

    companion object {
        private const val TAG = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = RecyclerAirCraftAdapter(this)
        binding.recycler.setHasFixedSize(true)
        binding.recycler.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.recycler.adapter = adapter


        //data source
//        this.airCrafts.addAll(DataSource.getAllAirCrafts(this))

        binding.toolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.about -> {
                    startActivity(Intent(this, AboutActivity::class.java))
                    true
                }
                else -> false
            }
        }

        binding.toolbar.setOnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->

        }

//        setDataToAdapter(adapter, airCrafts)
        val controller = AirCraftController()
        fetchDataFromController(controller, this, adapter)
    }

    fun setDataToAdapter(airCraftAdapter: RecyclerAirCraftAdapter, airCraftList: List<AirCraft>) {
        this.airCrafts.clear()
        airCraftAdapter.setData(airCraftList)
        Log.d(TAG, "MainActivity setData: invoked")
    }

    private fun fetchDataFromController(controller: AirCraftController, view: MainActivity, adapter: RecyclerAirCraftAdapter) {
        controller.injectViewAndAdapter(view, adapter)
    }


    override fun clickable(data: AirCraft) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(DetailActivity.KEY_NAME, data.name)
        intent.putExtra(DetailActivity.KEY_CODENAME, data.codename)
        intent.putExtra(DetailActivity.KEY_PHOTO, data.photoLink)
        intent.putExtra(DetailActivity.KEY_DESC, data.desc)
        intent.putExtra(DetailActivity.KEY_INFO, data.info)
        intent.putExtra(DetailActivity.KEY_VIDEO_ID, data.videoId)
        startActivity(intent)
    }


}