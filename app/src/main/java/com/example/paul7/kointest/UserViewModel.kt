package com.example.paul7.kointest

import android.arch.lifecycle.ViewModel

public class UserViewModel: ViewModel() {
    private var userList: List<User>? = null

    fun getUserList(): List<User>? {
        if (userList == null) {
            userList = loadUsers()
        }
        return userList
    }

    private fun loadUsers(): List<User> {
        // do something to load users
    }
}