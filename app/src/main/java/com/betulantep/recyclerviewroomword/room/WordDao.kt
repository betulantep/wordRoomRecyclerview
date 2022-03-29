package com.betulantep.recyclerviewroomword.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordDao {

    @Query("Select * from Word")
    fun getAll() : List<Word>

    @Insert
    fun insert(word : Word)
}