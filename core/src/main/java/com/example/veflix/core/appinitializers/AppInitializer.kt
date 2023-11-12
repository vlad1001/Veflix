package com.example.veflix.core.appinitializers

import android.app.Application

interface AppInitializer {
    fun init(application: Application)
}