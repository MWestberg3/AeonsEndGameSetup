package com.mwestberg3.aeonsendgamesetup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mwestberg3.aeonsendgamesetup.databinding.CardMenuFragmentBinding

class CardMenuFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = CardMenuFragmentBinding.inflate(inflater, container, false)

        binding.gemButton.setOnClickListener {
            findNavController().navigate(R.id.action_cardMenuFragment_to_gemPageFragment)
        }
        binding.relicButton.setOnClickListener {
            findNavController().navigate(R.id.action_cardMenuFragment_to_relicPageFragment)
        }
        binding.spellButton.setOnClickListener {
            findNavController().navigate(R.id.action_cardMenuFragment_to_spellPageFragment)
        }

        return binding.root
    }
}