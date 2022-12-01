package com.mwestberg3.aeonsendgamesetup

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mwestberg3.aeonsendgamesetup.databinding.RelicCardListItemBinding

class RelicCardAdapter(private val relicCards: List<RelicCard>): RecyclerView
.Adapter<RelicCardAdapter.ViewHolder>() {

    class ViewHolder(val binding: RelicCardListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RelicCardListItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val relicCard = relicCards[position]
        holder.binding.cardNameTV.text = relicCard.name
        holder.binding.cardDescriptionTV.text = relicCard.description
        holder.binding.cardCostTV.text = relicCard.cost
    }

    override fun getItemCount(): Int {
        return relicCards.size
    }
}