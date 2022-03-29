package com.betulantep.recyclerviewroomword.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Word(
    @ColumnInfo(name = "word")
    var word : String,
    @ColumnInfo(name = "mean")
    var mean : String
){
    @PrimaryKey(autoGenerate = true)
    var id = 0
}