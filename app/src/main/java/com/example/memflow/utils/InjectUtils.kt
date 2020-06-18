package com.example.memflow.utils
import android.content.Context
import androidx.fragment.app.Fragment
import com.example.memflow.data.AppDatabase
import com.example.memflow.data.WordEntryRepository
import com.example.memflow.ui.ViewModelFactory

object InjectUtils {
    private fun getWordEntryRepository(context: Context) : WordEntryRepository {
        return WordEntryRepository.getInstance(
            AppDatabase.getInstance(context.applicationContext).wordEntryDao())
    }

    fun provideVocabularyListViewModelFactory(fragment: Fragment) : ViewModelFactory {
        return ViewModelFactory(
            getWordEntryRepository(fragment.requireContext()),
            fragment
        )
    }

    fun provideVocabularyViewModelFactory(fragment: Fragment) : ViewModelFactory {
        return ViewModelFactory(
            getWordEntryRepository(fragment.requireContext()),
            fragment
        )
    }
}