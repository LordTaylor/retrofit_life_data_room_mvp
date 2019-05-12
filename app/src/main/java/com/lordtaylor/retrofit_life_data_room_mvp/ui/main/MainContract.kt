package com.lordtaylor.retrofit_life_data_room_mvp.ui.main

import com.lordtaylor.retrofit_life_data_room_mvp.ui.base.BaseContract

interface MainContract : BaseContract {
    interface Presenter : BaseContract.Presenter<View> {}

    interface View : BaseContract.View {

    }
}