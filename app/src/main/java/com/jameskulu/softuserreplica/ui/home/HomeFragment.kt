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

class HomeFragment : Fragment() {

    private lateinit var recyclerView : RecyclerView
    private var lstUsers = ArrayList<User>()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = root.findViewById(R.id.recyclerView)
        loadUsers()

        val adapter = context?.let { UserAdapter(lstUsers, it) }
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter


        return root
    }


    private fun loadUsers(){
        lstUsers.add(
            User(
                1,
                "James Kulu",
                20,
                "Nepal",
                "Male",
                "hello"
            )
        )

        lstUsers.add(
            User(
                2,
                "Rubi Bhandari",
                20,
                "India",
                "Female",
                "hello"
            )
        )
    }
}