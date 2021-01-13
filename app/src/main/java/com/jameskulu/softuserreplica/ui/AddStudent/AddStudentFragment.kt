package com.jameskulu.softuserreplica.ui.AddStudent

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jameskulu.softuserreplica.MainActivity
import com.jameskulu.softuserreplica.R
import com.jameskulu.softuserreplica.model.User

class AddStudentFragment : Fragment() {

    private var users = ArrayList<User>()
    private var gender = ""

    private lateinit var etFullName : EditText
    private lateinit var etAge : EditText
    private lateinit var etAddress : EditText
    private lateinit var rdoMale : RadioButton
    private lateinit var rdoFemale : RadioButton
    private lateinit var rdoOthers : RadioButton
    private lateinit var btnSave : Button


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_addstudent, container, false)

        etFullName = root.findViewById(R.id.etFullName)
        etAge = root.findViewById(R.id.etAge)
        etAddress = root.findViewById(R.id.etAddress)
        rdoMale = root.findViewById(R.id.rdoMale)
        rdoFemale = root.findViewById(R.id.rdoFemale)
        rdoOthers = root.findViewById(R.id.rdoOthers)
        btnSave = root.findViewById(R.id.btnSave)


        btnSave.setOnClickListener {
            if(validation()) {

                when {
                    rdoMale.isChecked -> {
                        gender = "Male"
                    }
                    rdoFemale.isChecked -> {
                        gender = "Female"
                    }
                    rdoOthers.isChecked -> {
                        gender = "Others"
                    }
                }


                users.add(
                    User(
                        1,
                        etFullName.text.toString(),
                        etAge.text.toString().toInt(),
                        etAddress.text.toString(),
                        gender,
                        "ss",
                    )
                )




                Toast.makeText(context, "Student saved", Toast.LENGTH_SHORT).show()
            }
        }

        return root
    }

    private fun validation():Boolean{
        var isEmpty:Boolean = true

        when {
            TextUtils.isEmpty(etFullName.text) -> {
                etFullName.error = "Enter full name."
                etFullName.requestFocus()
                isEmpty = false
            }
            TextUtils.isEmpty(etAge.text) -> {
                etAge.error = "Enter age."
                etAge.requestFocus()
                isEmpty = false
            }
            TextUtils.isEmpty(etAddress.text) -> {
                etAddress.error = "Enter address."
                etAddress.requestFocus()
                isEmpty = false
            }
        }
        return isEmpty
    }
}