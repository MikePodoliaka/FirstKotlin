package com.example.firstkotlin.presenters

import android.os.Handler
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.firstkotlin.views.LoginView

@InjectViewState
class LoginPresenter: MvpPresenter <LoginView> () {
    fun login(isSuccess:Boolean) {
        viewState.startLoading()
Handler().postDelayed({
    viewState.endLoading()
    if (isSuccess){
        viewState.openFriends()
    }
    else {
        viewState.showError("Login data is incorrect")
    }
},500

)
    }
}