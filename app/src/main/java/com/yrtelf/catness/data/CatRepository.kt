package com.yrtelf.catness.data

interface CatRepository {

    suspend fun getCatFacts(): List<Fact>

}