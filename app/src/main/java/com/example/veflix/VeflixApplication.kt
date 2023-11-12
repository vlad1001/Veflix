package com.example.veflix

import android.app.Application
import com.example.veflix.initializers.AppInitializers
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class VeflixApplication : Application() {

    @Inject
    lateinit var initializers: AppInitializers
    override fun onCreate() {
        super.onCreate()

        initializers.init(this)
    }
}