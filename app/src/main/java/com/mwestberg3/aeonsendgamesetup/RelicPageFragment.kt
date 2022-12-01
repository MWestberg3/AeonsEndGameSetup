package com.mwestberg3.aeonsendgamesetup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mwestberg3.aeonsendgamesetup.databinding.RelicPageFragmentBinding

data class RelicCard(
    val name: String,
    val description: String,
    val cost: String
)

class RelicPageFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = RelicPageFragmentBinding.inflate(inflater, container, false)


        return super.onCreateView(inflater, container, savedInstanceState)
    }
}