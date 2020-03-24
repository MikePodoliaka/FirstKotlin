package com.example.firstkotlin.models

class FriendModel {
    private var isOnline: Boolean
    private var avatar: String?
    private var city: String?
    private var surname: String
    private var name: String

    constructor(name:String, surname:String, city:String?, avatar:String?, isOnline:Boolean) {
        this.name=name
        this.surname=surname
        this.city=city
        this.avatar=avatar;
        this.isOnline=isOnline
    }
}