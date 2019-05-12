package com.lordtaylor.retrofit_life_data_room_mvp.ui.register

import com.lordtaylor.retrofit_life_data_room_mvp.ui.base.BaseContract

interface RegisterContract:BaseContract {
    interface Presenter:BaseContract.Presenter<View>
    interface View:BaseContract.View
}