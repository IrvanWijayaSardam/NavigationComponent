package com.aminivan.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_satu.*

class FragmentSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSatu.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentDua2)
        }

        btnToTiga.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentTiga22)
        }



    }

}