package com.versilis.sprintproject

import com.versilis.sprintproject.ui.MakeupListActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface Component {
    fun inject(mainActivity: MakeupListActivity)
}