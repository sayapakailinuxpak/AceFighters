package com.eldisproject.acefighters.data

import android.content.Context
import com.eldisproject.acefighters.R

import java.util.ArrayList

object DataSource {

    private fun getCodeName(context: Context, index: Int): String {
        return context.resources.getStringArray(R.array.air_craft_codename)[index]
    }

    private fun getPhotoLink(context: Context, index: Int): String {
        return context.resources.getStringArray(R.array.air_craft_photo_link)[index]
    }

    private fun getDesc(context: Context, index: Int): String {
        return context.resources.getStringArray(R.array.air_craft_description)[index]
    }

    private fun getInfo(context: Context, index: Int): String {
        return context.resources.getStringArray(R.array.air_craft_info_link)[index]
    }

    private fun getVideoId(context: Context, index: Int): String {
        return context.resources.getStringArray(R.array.air_craft_video_id)[index]
    }

    private val name: Array<String> = arrayOf(
            "Sukhoi SU-30",
            "Mikoyan MiG-29",
            "Saab JAS 39",
            "McDonnell Douglas F-15",
            "Sukhoi SU-34 Fullback",
            "Fairchild Republic A-10",
            "Lockheed Martin F-16",
            "Lockheed Martin F-22",
            "Mikoyan MiG-31",
            "Sukhoi SU-37",
            "Lockheed Martin F-35",
            "Dassault Rafale"
    )


    fun getAllAirCrafts(context: Context): ArrayList<AirCraft> {
        val airCraftList: ArrayList<AirCraft> = arrayListOf()
        for (position in name.indices) {
            val airCraft = AirCraft()
            airCraft.name = name[position]
            airCraft.codename = getCodeName(context, position)
            airCraft.photoLink = getPhotoLink(context, position)
            airCraft.desc = getDesc(context, position)
            airCraft.info = getInfo(context, position)
            airCraft.videoId = getVideoId(context, position)
            airCraftList.add(airCraft)
        }
        return airCraftList
    }




}