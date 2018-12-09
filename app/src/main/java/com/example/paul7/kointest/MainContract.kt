package com.example.paul7.kointest

interface MainContract{

    interface View : IBaseView{

    }
    interface Presenter : IBasePresenter<View>{

    }
}