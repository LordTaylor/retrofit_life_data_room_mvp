package com.lordtaylor.retrofit_life_data_room_mvp.ui.lists


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

import com.lordtaylor.retrofit_life_data_room_mvp.R
import kotlinx.android.synthetic.main.fragment_lista_base.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ListaBaseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_base, container, false)
        bottomNavigationView.inflateMenu(R.menu.bottom_navigation)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.bottom_navigation,menu)
    }

}
