package com.example.recyclerviewtraining.data

import com.example.recyclerviewtraining.R
import com.example.recyclerviewtraining.data.model.Skin

class DatasourceSkins {

    fun loadSkins(): List<Skin> {
        return listOf(
            Skin(R.string.Test,1)
        )
    }
}