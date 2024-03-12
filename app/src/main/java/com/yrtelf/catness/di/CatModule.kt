package com.yrtelf.catness.di


import com.yrtelf.catness.MainActivityViewModel
import com.yrtelf.catness.data.CatRepository
import com.yrtelf.catness.data.CatRepositoryImpl
import com.yrtelf.catness.data.CatService
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val catModule = module {
    single { provideRetrofit() }
    single { provideUserService(get()) }
    single<CatRepository> { CatRepositoryImpl(get()) }
    viewModel { MainActivityViewModel(get()) }
}

private fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://cat-fact.herokuapp.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

private fun provideUserService(retrofit: Retrofit): CatService {
    return retrofit.create(CatService::class.java)
}