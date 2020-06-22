package com.can.mvp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.can.mvp.Contract.MainActivityInterface
import com.can.mvp.Presentar.MainActivityPresenter
import com.can.mvp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , MainActivityInterface.View {


    private var  presenter: MainActivityPresenter? = null



    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue()
        }


        formebutton.setOnClickListener{
            (presenter?.changetext( formetext.text.toString()))
        }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
    override fun updateViewDatafornew() {
        editText.setText(presenter?.gettext())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter =  MainActivityPresenter(this)


    }
}
