package com.example.veflix.initializers

import android.app.Application
import com.example.veflix.BuildConfig
import com.example.veflix.core.appinitializers.AppInitializer
import com.example.veflix.core.logger.Logger
import javax.inject.Inject

class TimberInitializer @Inject constructor(
    private val logger: Logger
) : AppInitializer {

    override fun init(application: Application) {
        logger.setup(BuildConfig.DEBUG, application.applicationContext)
    }
}