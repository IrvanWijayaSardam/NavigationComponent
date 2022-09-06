package com.aminivan.navigationcomponent.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aminivan.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_hello.*


class FragmentHello : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hello, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var namaUser = arguments?.getString("namaUser")
        var tahunLahir = arguments?.getString("tahunLahir")

        tvHelloFHello.setText("Hello, "+namaUser)
        var umurInt = Math.abs(Integer.parseInt(tahunLahir.toString())-2022)
        tvUmur.setText(umurInt.toString()+" Tahun")


    }

}