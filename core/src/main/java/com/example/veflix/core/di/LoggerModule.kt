package com.example.veflix.core.di

import com.example.veflix.core.logger.Logger
import com.example.veflix.core.logger.VeflixLogger
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class LoggerModule {

    @Singleton
    @Binds
    internal abstract fun provideLogger(bind: VeflixLogger): Logger
}