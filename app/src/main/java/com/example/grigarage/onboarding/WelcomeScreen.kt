package com.example.grigarage.onboarding

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.grigarage.R

class WelcomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler(requireActivity().mainLooper).postDelayed({
            if (onBoardingFinished()){
                findNavController().navigate(R.id.action_welcomeScreen_to_menuFragment)
            } else {
                findNavController().navigate(R.id.action_welcomeScreen_to_viewPagerFragment)
            }

        }, 3000)
        return inflater.inflate(R.layout.fragment_welcome_screen, container, false)
    }

    private fun onBoardingFinished(): Boolean{
        val sharePref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharePref.getBoolean("Finished", false)
    }
}