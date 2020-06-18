package com.example.memflow.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wordEntries")
data class WordEntry(
    @PrimaryKey @ColumnInfo(name="word") val entryValue: String,
    val translation: String,
    val entryLanguage: String,
    val translationLanguage: String
) {
    override fun toString() = entryValue
}