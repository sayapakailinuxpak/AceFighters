package com.eldisproject.acefighters.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.eldisproject.acefighters.R
import com.eldisproject.acefighters.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAboutBinding
    companion object {
        private const val TAG = "AboutActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    @SuppressLint("QueryPermissionsNeeded")
    fun followIG(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(resources.getStringArray(R.array.author_social_media_link)[0]))
        if (intent.resolveActivity(packageManager) != null) startActivity(intent) else Log.d(
            TAG,
            "Can't handle this!"
        )

    }


    @SuppressLint("QueryPermissionsNeeded")
    fun followGithub(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(resources.getStringArray(R.array.author_social_media_link)[1]))
        if (intent.resolveActivity(packageManager) != null) startActivity(intent) else Log.d(
                TAG,
                "Can't handle this!"
        )
    }

    @SuppressLint("QueryPermissionsNeeded")
    fun followFacebook(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(resources.getStringArray(R.array.author_social_media_link)[2]))
        if (intent.resolveActivity(packageManager) != null) startActivity(intent) else Log.d(
                TAG,
                "Can't handle this!"
        )
    }


}