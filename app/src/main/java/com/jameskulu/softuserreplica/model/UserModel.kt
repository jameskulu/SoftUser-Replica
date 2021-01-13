package com.jameskulu.softuserreplica.model

import android.os.Parcel
import android.os.Parcelable

data class User(
        val userId: Int? = null,
        val userFullName: String? = null,
        val age: Int? = null,
        val address: String? = null,
        val gender: String? = null,
        val userImage: String? = null,
) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readValue(Int::class.java.classLoader) as? Int,
                parcel.readString(),
                parcel.readValue(Int::class.java.classLoader) as? Int,
                parcel.readString(),
                parcel.readString(),
                parcel.readString()
        ) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeValue(userId)
                parcel.writeString(userFullName)
                parcel.writeValue(age)
                parcel.writeString(address)
                parcel.writeString(gender)
                parcel.writeString(userImage)
        }

        override fun describeContents(): Int {
                return 0
        }

        companion object CREATOR : Parcelable.Creator<User> {
                override fun createFromParcel(parcel: Parcel): User {
                        return User(parcel)
                }

                override fun newArray(size: Int): Array<User?> {
                        return arrayOfNulls(size)
                }
        }

}