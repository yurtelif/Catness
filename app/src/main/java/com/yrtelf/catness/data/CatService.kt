package com.yrtelf.catness.data

import retrofit2.http.GET

interface CatService {

    @GET("/facts")
    suspend fun getFacts(): List<Fact>

}