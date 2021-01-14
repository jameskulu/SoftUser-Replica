package com.jameskulu.softuserreplica

import com.jameskulu.softuserreplica.model.User

object user {
    var lstUser = arrayListOf<User>()
    fun addUser(){
        lstUser.add(User(1,"James Kulu","20","Satbobato","Male"))
        lstUser.add(User(2,"Seamos Chaudhary","25","Nakhipot","Male"))
        lstUser.add(User(3,"Rubi Bhandari","21","Kharibot","Female"))
    }
}