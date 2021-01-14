package com.jameskulu.softuserreplica.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jameskulu.softuserreplica.R
import com.jameskulu.softuserreplica.adapter.UserAdapter
import com.jameskulu.softuserreplica.model.User
import com.jameskulu.softuserreplica.user

class HomeFragment : Fragment() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)
//        loadUsers()
        val adapter = context?.let { UserAdapter(user.lstUser, it) }
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter

    }


//    private fun loadUsers(){
//        lstUsers.add(
//            User(
//                1,
//                "James Kulu",
//                20,
//                "Nepal",
//                "Male",
//                maleImg
//            )
//        )
//
//        lstUsers.add(
//            User(
//                2,
//                "Rubi Bhandari",
//                20,
//                "India",
//                "Female",
//                femaleImg
//            )
//        )
//    }
}