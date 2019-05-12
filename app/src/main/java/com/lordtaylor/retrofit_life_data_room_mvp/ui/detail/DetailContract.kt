package com.lordtaylor.retrofit_life_data_room_mvp.ui.detail

import com.lordtaylor.retrofit_life_data_room_mvp.ui.base.BaseContract

interface DetailContract :BaseContract {
    interface View
    interface Presenter:BaseContract.Presenter<View>
}