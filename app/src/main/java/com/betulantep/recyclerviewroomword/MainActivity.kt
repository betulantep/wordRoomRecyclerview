package com.betulantep.recyclerviewroomword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.betulantep.recyclerviewroomword.adapter.WordAdapter
import com.betulantep.recyclerviewroomword.databinding.ActivityMainBinding
import com.betulantep.recyclerviewroomword.room.Word
import com.betulantep.recyclerviewroomword.room.WordDao
import com.betulantep.recyclerviewroomword.room.WordDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var wordList : ArrayList<Word>
    private lateinit var databaseDb: WordDatabase
    private lateinit var wordAdapter : WordAdapter
    private lateinit var wordDao: WordDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getDatabaseData()
    }

    private fun getDatabaseData() {
        databaseDb = WordDatabase.getWordDatabase(this)!!
        wordDao = databaseDb.wordDao()

        wordList = wordDao.getAll() as ArrayList<Word>
        if (wordList.isEmpty()){
            wordAddList()
        }

        wordAdapter = WordAdapter(wordList)

        binding.apply {
            recyclerView.layoutManager = LinearLayoutManager(applicationContext)
            recyclerView.adapter = wordAdapter
        }
    }

    private fun wordAddList() {
        wordDao.insert(Word("Acele etmek", "Hurry"))
        wordDao.insert(Word("Acıkmak", "Be hungry"))
        wordDao.insert(Word("Açıklamak", "Explain"))
        wordDao.insert(Word("Açmak", "Open"))
        wordDao.insert(Word("Açmak -ışık-", "Switch (turn) on"))
        wordDao.insert(Word("Affetmek", "Forgive"))
        wordDao.insert(Word("Ağlamak", "Cry"))
        wordDao.insert(Word("Ait olmak", "Belong to"))
        wordDao.insert(Word("Almak", "Take"))
        wordDao.insert(Word("Anlamak", "Understand"))
        wordDao.insert(Word("Anlaşmak", "Agree"))
        wordDao.insert(Word("Aramak", "Look for"))
        wordDao.insert(Word("Araştırmak", "Search, Seek"))
        wordDao.insert(Word("Aşık olmak", "Fall in love"))
        wordDao.insert(Word("Ateş etmek", "Shoot"))
        wordDao.insert(Word("Atlamak", "Jump"))
        wordDao.insert(Word("Atmak", "Throw"))
        wordDao.insert(Word("Ayakta durmak", "Stand up"))
        wordDao.insert(Word("Ayarlamak", "Adjust"))
        wordDao.insert(Word("Ayırmak", "Separate"))
        wordDao.insert(Word("Ayrılmak", "Leave"))
        wordDao.insert(Word("Bahse girmek", "Bet"))
        wordDao.insert(Word("Başaramamak", "Fail"))
        wordDao.insert(Word("Başarmak", "Succeed"))
        wordDao.insert(Word("Başına gelmek", "Happen"))
        wordDao.insert(Word("Başlamak", "Start, Begin"))
        wordDao.insert(Word("Beklemek", "Wait"))
        wordDao.insert(Word("Benzemek", "Look like"))
        wordDao.insert(Word("Bilmek", "Know"))
        wordDao.insert(Word("Binmek -oto-", "Get on"))
        wordDao.insert(Word("Bitirmek", "Finish, End"))
        wordDao.insert(Word("Boğulmak", "Drown"))
        wordDao.insert(Word("Boyamak", "Paint"))
        wordDao.insert(Word("Bulmak", "Find"))
        wordDao.insert(Word("Buluşmak", "Meet"))
        wordDao.insert(Word("Büyümek", "Grow"))
    }

    override fun onDestroy() {
        super.onDestroy()
        wordList.clear()
    }
}