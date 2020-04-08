package com.android.learningdays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.learningdays.fragment.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fl_container, HomeFragment().apply {
                this.arguments = Bundle().also {
                    it.putString("Home","Welcome to Recycler view page!")
                }
            }, "TAG_RECYCLER_VIEW_FRAGMENT").commit()
    }
}
