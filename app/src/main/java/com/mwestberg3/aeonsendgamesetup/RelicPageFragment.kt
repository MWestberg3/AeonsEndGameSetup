package com.mwestberg3.aeonsendgamesetup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
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

        val relicCards = listOf(RelicCard("FLEXING DAGGER", "The next time you focus or open a " +
                "breach this turn, it costs $3 less.\n-OR-\nDestroy this. Deal 1 damage.", "Cost:" +
                " $2"), RelicCard("BOTTLED VORTEX", "Destroy this. Destroy up to two cards in " +
                "your hand or discard pile. Draw a card.", "Cost: $3"), RelicCard("UNSTABLE " +
                "PRISM", "Play a gem in hand twice and destroy it.\n-OR-\nGain $2.", "Cost: $3"),
            RelicCard("BLASTING STAFF", "You may cast a prepped spell that you prepped this turn." +
                    " If you do, that spell deals 2 additional damage.", "Cost: $4"), RelicCard
        ("FOCUSING ORB", "Focus any player's breach.\n-OR-\nDestroy this. Gravehold gains 3 life" +
                    ".", "Cost: $4"), RelicCard("MAGE'S TALISMAN", "Gain 1 charge. Any ally gains" +
                    " 1 charge.", "Cost: $5")
        )

        binding.relicPageFragment.adapter = RelicCardAdapter(relicCards)

        binding.relicPageFragment.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }
}