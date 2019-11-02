package com.versilis.sprintproject

import com.versilis.sprintproject.data.remote.MakeupApiProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object NetworkModule {
    @Provides
    @Singleton
    fun provideMakeupService() = MakeupApiProvider().getMakeupService()
}