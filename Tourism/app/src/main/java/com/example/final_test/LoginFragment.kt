package com.example.final_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation


class LoginFragment : Fragment(), View.OnClickListener {
    lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.login_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.getintouch_btn).setOnClickListener(this)
        view.findViewById<EditText>(R.id.textView).setOnClickListener(this)
        view.findViewById<EditText>(R.id.textView2).setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when(v!!.id){
            R.id.login_btn -> navController.navigate(R.id.action_loginFragment_to_listFragment)
            R.id.getintouch_btn -> Toast.makeText(context, "You will receive a call soon", Toast.LENGTH_SHORT).show()


        }

    }


}