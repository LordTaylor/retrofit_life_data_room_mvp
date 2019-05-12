package com.lordtaylor.retrofit_life_data_room_mvp.di.Components

import com.lordtaylor.retrofit_life_data_room_mvp.MainActivity
import com.lordtaylor.retrofit_life_data_room_mvp.di.Basic.BasicApp
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface PresenterComponent{
    fun inject(basicApp:BasicApp)
    fun inject(activity:MainActivity)
}