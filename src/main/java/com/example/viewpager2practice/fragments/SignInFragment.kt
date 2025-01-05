package com.example.viewpager2practice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.viewpager2practice.R


class SignInFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = arguments?.getString("name")
        val password = arguments?.getString("password")

        val userNameLoginET = view.findViewById<EditText>(R.id.userNameLoginET)
        val passwordLoginET = view.findViewById<EditText>(R.id.passwordLoginET)
        val loginSignInBTN = view.findViewById<Button>(R.id.loginSignInBTN)
        loginSignInBTN.setOnClickListener {
            if(name!= userNameLoginET.text.toString() ||
                password != passwordLoginET.text.toString()){
                Toast.makeText(context, "Неправильно введен логин или пароль", Toast.LENGTH_LONG).show()
            }else{
                fragmentManager?.beginTransaction()?.replace(R.id.containerID, MainFragment())?.commit()
            }
        }
    }

}