package com.yrtelf.catness.data

class CatRepositoryImpl(private val catService: CatService): CatRepository {

    override suspend fun getCatFacts(): List<Fact> {
        return catService.getFacts()
    }

}