package com.example.memflow.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WordEntryDao {
    @Query("SELECT * FROM wordEntries ORDER BY word")
    fun getWordEntries(): LiveData<List<WordEntry>>

    @Query("SELECT * FROM wordEntries WHERE word = :entryValue")
    fun getWordEntry(entryValue: String): LiveData<WordEntry>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(wordEntries: List<WordEntry>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(wordEntry: WordEntry)
}