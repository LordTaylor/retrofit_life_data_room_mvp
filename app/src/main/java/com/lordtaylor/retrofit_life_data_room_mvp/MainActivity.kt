package com.lordtaylor.retrofit_life_data_room_mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.lordtaylor.retrofit_life_data_room_mvp.ui.ViewModel.MyAppViewModel
import com.lordtaylor.retrofit_life_data_room_mvp.ui.lists.ListaBaseFragment

class MainActivity : AppCompatActivity() {

    lateinit var myViewModel:MyAppViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        myViewModel = ViewModelProviders.of(this).get(MyAppViewModel::class.java)

        supportFragmentManager.beginTransaction().replace(R.id.base_container,ListaBaseFragment()).commit()
    }
}
