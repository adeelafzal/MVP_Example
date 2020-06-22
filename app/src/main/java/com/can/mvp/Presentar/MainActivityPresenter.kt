package com.can.mvp.Presentar


import com.can.mvp.Contract.MainActivityInterface
import com.can.mvp.Model.MainActivityModel

class MainActivityPresenter(_view: MainActivityInterface.View): MainActivityInterface.Presenter {

    private var view: MainActivityInterface.View = _view
    private var model: MainActivityInterface.Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun changetext(name:String) {
        model.changetext(name)
        view.updateViewDatafornew()
    }

    override fun getCounter() = model.getCounter().toString()
    override fun gettext() = model.gettext().toString()

}