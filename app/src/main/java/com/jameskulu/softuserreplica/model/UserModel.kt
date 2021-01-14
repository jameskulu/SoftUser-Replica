package com.jameskulu.softuserreplica.model

import android.os.Parcel
import android.os.Parcelable

data class User(
        val userId: Int? = null,
        val userFullName: String? = null,
        val age: String? = null,
        val address: String? = null,
        val gender: String? = null
) {

}