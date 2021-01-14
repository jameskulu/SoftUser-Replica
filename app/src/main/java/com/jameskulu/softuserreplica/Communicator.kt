package com.jameskulu.softuserreplica

import com.jameskulu.softuserreplica.model.User

interface Communicator {
    fun passData(studentList : ArrayList<User>)
}