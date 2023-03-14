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
                //truyền dữ liệu trực tiếp bằng intent
                //name trong putextra giống như 1 cái id để phân biệt
//                intent.putExtra("bienstring","hello")
//                intent.putExtra("bienint",123)
//                intent.putExtra("bienbool",true)

                //gửi bằng bundle(đóng gói lại để gửi)
                //1. nạp dữ liệu
                val bundle = Bundle()
                bundle.putString("bienstring","hello")
                bundle.putInt("bienint",123)
                bundle.putBoolean("bienbool",true)
                bundle.putDouble("biendouble",7.8)

                //đặt bundle vào trong intent
                intent.putExtras(bundle)
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