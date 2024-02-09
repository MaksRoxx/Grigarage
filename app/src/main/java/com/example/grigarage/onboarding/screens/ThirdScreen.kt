package com.example.grigarage.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.grigarage.R

class ThirdScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.bNext).setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_menuFragment)
            onBoardingFinished()
        }
    }

    private fun onBoardingFinished(){
        requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
            .edit().putBoolean("Finished", true).apply()
    }
}