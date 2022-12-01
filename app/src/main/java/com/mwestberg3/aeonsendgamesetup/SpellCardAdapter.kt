package com.mwestberg3.aeonsendgamesetup

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mwestberg3.aeonsendgamesetup.databinding.SpellCardListItemBinding

class SpellCardAdapter(private val spellCards: List<SpellCard>): RecyclerView
.Adapter<SpellCardAdapter.ViewHolder>() {

    class ViewHolder(val binding: SpellCardListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SpellCardListItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val spellCard = spellCards[position]
        holder.binding.cardNameTV.text = spellCard.name
        holder.binding.cardDescriptionTV.text = spellCard.description
        holder.binding.cardCostTV.text = spellCard.cost
    }

    override fun getItemCount(): Int {
        return spellCards.size
    }

}