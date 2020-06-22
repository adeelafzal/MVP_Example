package com.can.mvp.Model

import com.can.mvp.Contract.MainActivityInterface

class MainActivityModel: MainActivityInterface.Model {

    private var mCounter = 0
    private var changetext = ""

    override fun getCounter()= mCounter

    override fun incrementCounter() {
        mCounter++
    }

    override fun changetext(name:String) {
        changetext = name
    }
    override fun gettext()= changetext
}