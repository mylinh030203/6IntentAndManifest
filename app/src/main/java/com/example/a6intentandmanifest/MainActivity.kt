package com.example.a6intentandmanifest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bntClick : Button = findViewById(R.id.btnclick)
        //gọi mh2 từ màn hình main: intent tường minh
        bntClick.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val intent : Intent = Intent(this@MainActivity, SecondActivity::class.java)//chuyển từ mh này sang mh khác
                startActivity(intent)
            }

        }
        )
        //gọi url từ màn hình main: intent không tường minh
        btnclick2.setOnClickListener{
            val intent2 : Intent = Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/")
            )
            startActivity(intent2)

        }
    }
}