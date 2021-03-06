package com.example.memflow.ui.vocabulary

import androidx.lifecycle.ViewModel
import com.example.memflow.data.WordEntry
import com.example.memflow.data.WordEntryRepository
import kotlinx.coroutines.*

class VocabularyViewModel(
    private val repository: WordEntryRepository
) : ViewModel() {

    fun submitEntry(entry: WordEntry) {
        GlobalScope.launch {
            repository.insertWord(entry)
        }
    }
}