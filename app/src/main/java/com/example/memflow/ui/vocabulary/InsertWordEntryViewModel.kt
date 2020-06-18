package com.example.memflow.ui.vocabulary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.memflow.data.WordEntry
import com.example.memflow.data.WordEntryRepository

class InsertWordEntryViewModel(
    private val repository: WordEntryRepository
) : ViewModel() {

}