package com.example.paul7.kointest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity(),MainContract.View{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
