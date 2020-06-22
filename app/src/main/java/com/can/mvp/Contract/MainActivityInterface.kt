package com.can.mvp.Contract

interface MainActivityInterface {

    interface View {
        fun initView()
        fun updateViewData()
        fun updateViewDatafornew()
    }

    interface Presenter {
        fun incrementValue()
        fun changetext(name:String)
        fun getCounter(): String
        fun gettext(): String
    }

    interface Model {
        fun gettext():String
        fun getCounter(): Int
        fun changetext(name:String)
        fun incrementCounter()
    }

}