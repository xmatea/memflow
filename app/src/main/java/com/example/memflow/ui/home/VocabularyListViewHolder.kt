package com.example.memflow.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.memflow.R
import com.example.memflow.data.WordEntry

class VocabularyListViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.vocabulary_item, parent, false)) {
    private lateinit var wordView: TextView
    private lateinit var translationView: TextView

    init {
        wordView = itemView.findViewById(R.id.list_title)
        translationView = itemView.findViewById(R.id.list_description)
    }

    fun bind(wordEntry: WordEntry) {
        wordView.text = wordEntry.entryValue
        translationView.text = wordEntry.translation
    }
}