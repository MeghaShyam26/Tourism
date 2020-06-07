package com.example.final_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class listFragment : Fragment(), View.OnClickListener {
    lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.Places).setOnClickListener(this)
        view.findViewById<Button>(R.id.Hotels).setOnClickListener(this)
        view.findViewById<Button>(R.id.Temples).setOnClickListener(this)
        view.findViewById<Button>(R.id.StreetFood).setOnClickListener(this)
        view.findViewById<Button>(R.id.Church).setOnClickListener(this)
        view.findViewById<Button>(R.id.Parks).setOnClickListener(this)
        view.findViewById<Button>(R.id.Malls).setOnClickListener(this)
        view.findViewById<Button>(R.id.Beaches).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.Places -> navController.navigate(R.id.action_listFragment_to_placesFragment)
            R.id.Hotels -> navController.navigate(R.id.action_listFragment_to_hotelFragment)
            R.id.Temples -> navController.navigate(R.id.action_listFragment_to_templeFragment)
            R.id.StreetFood -> navController.navigate(R.id.action_listFragment_to_streetfoodFragment)
            R.id.Church -> navController.navigate(R.id.action_listFragment_to_churchFragment)
            R.id.Parks -> navController.navigate(R.id.action_listFragment_to_parkFragment)
            R.id.Malls -> navController.navigate(R.id.action_listFragment_to_mallsFragment)
            R.id.Beaches -> navController.navigate(R.id.action_listFragment_to_beachFragment)
        }
    }


}