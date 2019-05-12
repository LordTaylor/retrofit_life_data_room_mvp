package com.lordtaylor.retrofit_life_data_room_mvp.ui.detail

class DetailPresenter : DetailContract.Presenter {

    lateinit var view: DetailContract.View
    override fun atach(view: DetailContract.View) {
        this.view = view
    }
}