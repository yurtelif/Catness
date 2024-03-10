package com.yrtelf.catness

import android.app.Application
import com.yrtelf.catness.di.catModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CatApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CatApplication)
            modules(catModule)
        }
    }
}