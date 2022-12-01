package com.mwestberg3.aeonsendgamesetup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mwestberg3.aeonsendgamesetup.databinding.GemPageFragmentBinding

data class GemCard(
    val name: String,
    val description: String,
    val cost: String
)

class GemPageFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = GemPageFragmentBinding.inflate(layoutInflater)

        val gemCards = listOf(GemCard("JADE", "Gain $2", "Cost: $2"), GemCard("SIFTER'S PEARL",
            "Gain $2. Each player reveals the top card of their deck and either discards it or " +
                    "returns it to the top of their deck", "Cost: $3"), GemCard("V'RISWOOD " +
                "AMBER", "When you gain this, you may place it on top of your deck. Gain $2.",
            "Cost: $3"), GemCard("DIAMOND CLUSTER", "Gain $2. If this is the second time you have" +
                " played Diamond Cluster this turn, gain an additional $2.", "Cost: $4"), GemCard
            ("SEARING RUBY", "Gain $2. Gain and addition $1 that can only be used to gain a spell" +
                ".", "Cost: $4"), GemCard("BURNING OPAL", "Gain $3. You may discard a card in " +
                "hand. If you do, any ally draws a card.", "Cost: $5"), GemCard("CLOUDED " +
                "SAPPHIRE", "Gain $3. If this is the first time you have played Clouded Sapphire " +
                "this turn, any ally gains 1 charge.", "Cost: $6")
        )

        binding.gemPageFragment.adapter = GemCardAdapter(gemCards)

        binding.gemPageFragment.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }
}