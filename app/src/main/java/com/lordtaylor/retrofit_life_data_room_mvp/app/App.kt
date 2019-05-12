package com.lordtaylor.retrofit_life_data_room_mvp.app

import com.lordtaylor.retrofit_life_data_room_mvp.di.Basic.BasicApp
import com.lordtaylor.retrofit_life_data_room_mvp.di.Components.DaggerPresenterComponent
import com.lordtaylor.retrofit_life_data_room_mvp.di.Components.PresenterComponent

class App : BasicApp() {

    override fun initApp() {
        injectDependency()
    }

    fun injectDependency() {
        var component: PresenterComponent = DaggerPresenterComponent.create()
        component.inject(this)
    }

}