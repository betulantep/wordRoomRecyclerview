package com.betulantep.recyclerviewroomword.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Word::class], version = 1)
abstract class WordDatabase :RoomDatabase() {
    abstract fun wordDao() : WordDao

    companion object{
        private var instance : WordDatabase? = null

        fun getWordDatabase(context: Context) : WordDatabase?{
            if(instance == null){
                instance = Room.databaseBuilder(context,WordDatabase::class.java,"worddb")
                    .allowMainThreadQueries()
                    .build()
            }
            return instance
        }
    }
}
