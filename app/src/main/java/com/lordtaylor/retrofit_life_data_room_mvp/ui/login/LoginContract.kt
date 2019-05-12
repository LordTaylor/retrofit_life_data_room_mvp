package com.lordtaylor.retrofit_life_data_room_mvp.ui.login

import com.lordtaylor.retrofit_life_data_room_mvp.ui.base.BaseContract

interface LoginContract:BaseContract {
    interface Presenter:BaseContract.Presenter<View>
    interface View:BaseContract.View
}