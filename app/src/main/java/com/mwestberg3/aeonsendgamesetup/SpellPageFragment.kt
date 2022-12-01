package com.mwestberg3.aeonsendgamesetup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mwestberg3.aeonsendgamesetup.databinding.SpellPageFragmentBinding

data class SpellCard(
    val name: String,
    val description: String,
    val cost: String
)

class SpellPageFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = SpellPageFragmentBinding.inflate(inflater, container, false)

        val spellCards = listOf(SpellCard("PHOENIX FLAME", "Cast: Deal 2 damage. You may lose 1 " +
                "charge to deal 2 additional damage", "Cost: $3"), SpellCard("AMPLIFY VISION",
            "Cast: Focus your closed breach with the lowest focus cost. Deal 2 damage. if all of " +
                    "your breaches are opened, deal 1 additional damage.", "Cost: $4"), SpellCard
        ("DARK FIRE", "Cast: Discard up to two cards in hand. Deal 3 damage for each card " +
                "discarded this way.", "Cost: $5"), SpellCard("PLANAR INSIGHT", "Cast: Deal 2 " +
                "damage. Deal 1 additional damage for each of your opened breaches.", "Cost: $6")
            , SpellCard("ARCANE NEXUS", "While prepped, once per turn during your main phase you " +
                    "may return a gem you played this turn to your hand. Cast: Deal 4 damage.",
                "Cost: $7")
        )

        binding.spellPageFragment.adapter = SpellCardAdapter(spellCards)

        binding.spellPageFragment.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }
}