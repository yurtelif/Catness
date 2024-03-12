package com.yrtelf.catness

import androidx.lifecycle.ViewModel
import com.yrtelf.catness.data.CatRepository
import com.yrtelf.catness.data.Fact

class MainActivityViewModel(private val catRepository: CatRepository) : ViewModel() {
    suspend fun getCatFacts(): List<Fact>{
        return catRepository.getCatFacts()
    }
}