package com.example.memflow.ui

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.memflow.data.WordEntryRepository
import com.example.memflow.ui.home.VocabularyListViewModel
import com.example.memflow.ui.vocabulary.VocabularyViewModel

class ViewModelFactory(
    private val wordEntryRepository: WordEntryRepository,
    fragment: Fragment
) : ViewModel() {
    fun createVocabularyListViewModel() : VocabularyListViewModel {
        return VocabularyListViewModel(
            wordEntryRepository
        )
    }

    fun createVocabularyViewModel() : VocabularyViewModel {
        return VocabularyViewModel(
            wordEntryRepository
        )
    }
}