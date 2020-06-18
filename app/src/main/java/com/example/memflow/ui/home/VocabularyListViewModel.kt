package com.example.memflow.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.memflow.data.WordEntry
import com.example.memflow.data.WordEntryRepository
import com.example.memflow.utils.InjectUtils
import java.util.*

class VocabularyListViewModel(
    private val repository: WordEntryRepository
) : ViewModel() {
    var dictionary = loadDictionary()

    private fun loadDictionary() : LiveData<List<WordEntry>> {
        return repository.getWords()
    }

    fun getEntry(entry: String): LiveData<WordEntry> {
        return repository.getWord(entry)
    }
}