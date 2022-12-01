package com.mwestberg3.aeonsendgamesetup

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.recyclerview.widget.RecyclerView
import com.mwestberg3.aeonsendgamesetup.databinding.GemCardListItemBinding

class GemCardAdapter(private val gemCards: List<GemCard>): RecyclerView.Adapter<GemCardAdapter
.ViewHolder>() {

    class ViewHolder(val binding: GemCardListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GemCardListItemBinding.inflate(LayoutInflater.from(parent.context), parent,
            false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gemCard = gemCards[position]
        holder.binding.cardNameTV.text = gemCard.name
        holder.binding.cardDescriptionTV.text = gemCard.description
        holder.binding.cardCostTV.text = gemCard.cost
    }

    override fun getItemCount(): Int {
        return gemCards.size
    }
}

