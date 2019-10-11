package com.hq.testscrollview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hq.testscrollview.main.MainActivity
import com.hq.testscrollview.two.TwoActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        bt_one.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        bt_two.setOnClickListener {
            startActivity(Intent(this,TwoActivity::class.java))
        }
    }
}
