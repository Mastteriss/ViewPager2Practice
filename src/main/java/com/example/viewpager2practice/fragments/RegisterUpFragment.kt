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


class RegisterUpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        return inflater.inflate(R.layout.fragment_register_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userNameRegisterET = view.findViewById<EditText>(R.id.userNameRegisterET)
        val passwordNameRegisterET = view.findViewById<EditText>(R.id.passwordNameRegisterET)
        val loginRegisterBTN = view.findViewById<Button>(R.id.loginRegisterBTN)
        loginRegisterBTN.setOnClickListener {
            val userNameRegisterUp = userNameRegisterET.text.toString()
            val passwordRegisterUP = passwordNameRegisterET.text.toString()
            if(passwordRegisterUP.isEmpty() || userNameRegisterUp.isEmpty()){
                Toast.makeText(context, "Данные не введены", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val bundle = Bundle()
            val signInFragment = SignInFragment()
            bundle.putString("name", userNameRegisterUp)
            bundle.putString("password", passwordRegisterUP)
            signInFragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.containerID, signInFragment)?.commit()
            Toast.makeText(context, "Вы успешно зарегистрированы", Toast.LENGTH_LONG).show()
        }
    }



}