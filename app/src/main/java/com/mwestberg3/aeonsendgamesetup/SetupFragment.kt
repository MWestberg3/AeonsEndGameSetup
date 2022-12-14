package com.mwestberg3.aeonsendgamesetup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mwestberg3.aeonsendgamesetup.databinding.SetupFragmentBinding

class SetupFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = SetupFragmentBinding.inflate(inflater, container, false)

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}