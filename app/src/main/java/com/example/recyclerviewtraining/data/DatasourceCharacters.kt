package com.example.recyclerviewtraining.data

import com.example.recyclerviewtraining.R
import com.example.recyclerviewtraining.data.model.Character
import com.example.recyclerviewtraining.data.model.Skin

class DatasourceCharacters {

    fun loadCharacters(): List<Character> {
        return listOf(
            Character(R.string.Test)
        )
    }
}