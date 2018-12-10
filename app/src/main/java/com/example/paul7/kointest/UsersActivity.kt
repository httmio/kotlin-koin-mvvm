package com.example.paul7.kointest

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class UsersActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        var mUserViewModel:UserViewModel = ViewModelProviders.of(this@UsersActivity)
                .get(UserViewModel::class.java)
       // showUsers(mUserViewModel.getUserList())
    }
}