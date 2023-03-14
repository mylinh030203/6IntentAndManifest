package com.example.a6intentandmanifest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //get dữ liệu từ intent ở main
//        val i = intent
//        var bienstrings = i.getStringExtra("bienstring")
//        var bienInteger = i.getIntExtra("bienint",0)
//        var bienBool = i.getBooleanExtra("bienbool",false)
//        etDulieu.setText(bienstrings+"\n"+bienInteger+"\n"+bienBool)

        //get dữ liệu từ bundle
        val i = intent
        //lấy bundle ra khỏi intent
        var bundle = i.extras
        if(bundle!=null){
            var bienstrings = bundle.getString("bienstring")
        var bienInteger = bundle.getInt("bienint",0)
        var bienBool = bundle.getBoolean("bienbool",false)
            var biendouble = bundle.getDouble("biendouble")
            etDulieu.setText(bienstrings+"\n"+bienInteger+"\n"+bienBool+"\n"+biendouble)

        }




        mh2.setOnClickListener{
            var intent2 :Intent = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }


    }
}