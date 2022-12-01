package com.mwestberg3.aeonsendgamesetup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mwestberg3.aeonsendgamesetup.databinding.HomeFragmentBinding


class HomeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = HomeFragmentBinding.inflate(inflater, container, false)
        binding.cardMenuButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_cardMenuFragment)
        }
        binding.setupButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_setupFragment)
        }

        return binding.root
    }
}