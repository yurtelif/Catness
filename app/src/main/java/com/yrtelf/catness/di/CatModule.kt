package com.yrtelf.catness.di

import com.yrtelf.catness.data.CatRepository
import com.yrtelf.catness.data.CatRepositoryImpl
import org.koin.dsl.module

val catModule = module {
    single<CatRepository> { CatRepositoryImpl(get()) }

}