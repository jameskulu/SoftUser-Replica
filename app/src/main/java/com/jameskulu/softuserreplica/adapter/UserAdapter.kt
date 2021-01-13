package com.jameskulu.softuserreplica.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jameskulu.softuserreplica.R
import com.jameskulu.softuserreplica.model.User

class UserAdapter(
        val lstUsers : ArrayList<User>,
        val context : Context

) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imgProfile : ImageView
        val tvName : TextView
        val tvAddress : TextView
        val tvAge : TextView
        val tvGender : TextView

        init {
            imgProfile = view.findViewById(R.id.imgProfile)
            tvName = view.findViewById(R.id.tvName)
            tvAddress = view.findViewById(R.id.tvAddress)
            tvAge = view.findViewById(R.id.tvAge)
            tvGender = view.findViewById(R.id.tvGender)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.user,parent,false)
        return UserViewHolder(view)
    }

    // Data tanne kam
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = lstUsers[position]
        holder.tvName.text =  user.userFullName
        holder.tvAddress.text = user.address
        holder.tvAge.text = user.age?.toInt().toString()
        holder.tvGender.text = user.gender

        Glide.with(context)
                .load(user.userImage)
                .into(holder.imgProfile)
    }

    override fun getItemCount(): Int {
        return lstUsers.size
    }
}