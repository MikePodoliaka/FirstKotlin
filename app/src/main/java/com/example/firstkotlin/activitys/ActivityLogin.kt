package com.example.firstkotlin.activitys

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.firstkotlin.R
import com.example.firstkotlin.presenters.LoginPresenter
import com.example.firstkotlin.views.LoginView
import com.github.guilhe.views.CircularProgressView


class ActivityLogin : MvpAppCompatActivity(), LoginView {


    private lateinit var mCpvWait: CircularProgressView
    private lateinit var mTxtHello: TextView
    private lateinit var mBtnEnter: Button

    @InjectPresenter
    lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mTxtHello = findViewById(R.id.tv_hello_login)
        mBtnEnter = findViewById(R.id.but_login)
        mCpvWait = findViewById(R.id.cvt_login)

        mBtnEnter.setOnClickListener {
            loginPresenter.login (true)
        }

    }

    override fun startLoading() {
        mBtnEnter.visibility=View.GONE
        mCpvWait.visibility=View.VISIBLE
    }

    override fun endLoading() {
        mBtnEnter.visibility=View.VISIBLE
        mCpvWait.visibility=View.GONE
    }

    override fun showError(text: String) {
       Toast.makeText(applicationContext,text,Toast.LENGTH_SHORT).show()
    }

    override fun openFriends() {
        startActivity(Intent(applicationContext,FriendsActivity::class.java))
    }


}

