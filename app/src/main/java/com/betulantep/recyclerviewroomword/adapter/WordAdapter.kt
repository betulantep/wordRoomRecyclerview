package com.betulantep.recyclerviewroomword.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.betulantep.recyclerviewroomword.databinding.LayoutRowBinding
import com.betulantep.recyclerviewroomword.room.Word

class WordAdapter(var wordList : List<Word>) : RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    class WordViewHolder(var layoutRowBinding: LayoutRowBinding) : RecyclerView.ViewHolder(layoutRowBinding.root){

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val view = LayoutRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return WordViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.layoutRowBinding.wordText.text = wordList[position].word
        holder.layoutRowBinding.meanText.text = wordList[position].mean
    }

    override fun getItemCount(): Int {
        return wordList.size
    }


}