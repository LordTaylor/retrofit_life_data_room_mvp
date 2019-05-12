package com.lordtaylor.retrofit_life_data_room_mvp.ui.lists

import com.lordtaylor.retrofit_life_data_room_mvp.ui.base.BaseContract

interface ListBaseContract : BaseContract {
    interface Presenter : BaseContract.Presenter<View>
    interface View : BaseContract.View
}