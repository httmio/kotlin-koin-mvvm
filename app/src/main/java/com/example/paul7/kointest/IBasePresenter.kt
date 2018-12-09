package com.example.paul7.kointest

interface IBasePresenter<in V> {
    fun start(view : V)
    fun destory()
}