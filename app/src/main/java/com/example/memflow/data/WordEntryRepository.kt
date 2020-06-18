package com.example.memflow.data

class WordEntryRepository private constructor(private val wordEntryDao: WordEntryDao) {

    fun getWords() = wordEntryDao.getWordEntries()
    fun getWord(entryValue: String) = wordEntryDao.getWordEntry(entryValue)
    suspend fun insertWord(wordEntry: WordEntry) = wordEntryDao.insert(wordEntry)

    companion object {
        @Volatile private var instance: WordEntryRepository? = null

        fun getInstance(wordEntryDao: WordEntryDao) =
            instance ?: synchronized(this) {
                instance ?: WordEntryRepository(wordEntryDao).also { instance = it }
            }
    }
}