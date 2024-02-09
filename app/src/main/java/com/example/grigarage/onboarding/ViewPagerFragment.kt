package com.example.grigarage.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grigarage.databinding.FragmentViewPagerBinding
import com.example.grigarage.onboarding.screens.FirstScreen
import com.example.grigarage.onboarding.screens.SecondScreen
import com.example.grigarage.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment() {
    private lateinit var binding: FragmentViewPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentList = listOf(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )
        val adapter = ViewPagerAdapter(requireActivity(), fragmentList)
        binding.screensPager.adapter = adapter
    }
}