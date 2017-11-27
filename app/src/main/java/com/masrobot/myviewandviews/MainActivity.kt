package com.masrobot.myviewandviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * Android Basic Layout, dari kelas dicoding "Belajar Membuat Aplikasi Android Pemula"
 * Link kelas ada di https://s.id/LgC
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar.title = "Google Pixel"
    }
}
