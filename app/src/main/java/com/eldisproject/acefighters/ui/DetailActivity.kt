package com.eldisproject.acefighters.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.eldisproject.acefighters.R
import com.eldisproject.acefighters.data.AirCraft
import com.eldisproject.acefighters.data.DataSource
import com.eldisproject.acefighters.databinding.ActivityDetailBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object {
        private const val TAG = "DetailActivity"
        const val KEY_NAME = "name"
        const val KEY_CODENAME = "codename"
        const val KEY_PHOTO = "photo"
        const val KEY_DESC = "desc"
        const val KEY_INFO = "info"
        const val KEY_VIDEO_ID = "videoId"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Glide.with(this)
            .load(intent.getStringExtra(KEY_PHOTO))
            .into(binding.imageJumbotron)
        binding.textAirCraftNameOnDetail.text = intent.getStringExtra(KEY_NAME)
        binding.textAirCraftDescOnDetail.text = intent.getStringExtra(KEY_DESC)
        //info
        binding.ytPlayerViewInDetail.addYouTubePlayerListener(object: AbstractYouTubePlayerListener(){
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = intent.getStringExtra(KEY_VIDEO_ID)
                if (videoId != null) {
                    youTubePlayer.loadVideo(videoId, 0f)
                }
            }
        })

        Log.d(TAG, "DetailActivity onCreate: invoked!")
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.ytPlayerViewInDetail.release()
        Log.d(TAG, "DetailActivity onDestroy: invoked!")
    }


}