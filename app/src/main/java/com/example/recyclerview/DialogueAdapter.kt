package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DialogueAdapter(private val dialogues : List<Dialogue>) : RecyclerView.Adapter<DialogueAdapter.QuoteViewHolder>() {


    inner class QuoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val dialogueBody: TextView = itemView.findViewById(R.id.dialogue_body)
        val movieName : TextView = itemView.findViewById(R.id.movie_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dialogue_item, parent, false)
        return QuoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        val dialogue : Dialogue = dialogues[position]
        holder.dialogueBody.text = dialogue.body
        holder.movieName.text = dialogue.movieName
    }

    override fun getItemCount() = dialogues.size
}
