package com.lordtaylor.retrofit_life_data_room_mvp.ui.base

interface BaseContract {
    interface Presenter<in T> {
        fun atach(view: T)
    }

    interface View {
    }
}