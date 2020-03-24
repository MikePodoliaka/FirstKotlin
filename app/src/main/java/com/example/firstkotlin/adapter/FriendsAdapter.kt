package com.example.firstkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firstkotlin.R
import com.example.firstkotlin.models.FriendModel

class FriendsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var mFriendsList: ArrayList<FriendModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.cell_friend, parent, false)
        return FriendsViewHolder(itemView = itemView)
    }

    override fun getItemCount(): Int {
        return mFriendsList.count()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    class FriendsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}