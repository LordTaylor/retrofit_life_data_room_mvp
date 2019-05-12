package com.lordtaylor.retrofit_life_data_room_mvp.ui.ViewModel

import androidx.lifecycle.AndroidViewModel
import com.lordtaylor.retrofit_life_data_room_mvp.di.Basic.BasicApp
import javax.inject.Inject

class MyAppViewModel @Inject constructor(val application:BasicApp)  : AndroidViewModel(application) {


}