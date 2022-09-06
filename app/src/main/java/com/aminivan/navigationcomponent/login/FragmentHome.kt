package com.aminivan.navigationcomponent.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.aminivan.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_login.*


class FragmentHome : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getUmur = arguments?.getString("username")
        tvHello.setText("Hello, "+getUmur)

        Toast.makeText(context,"Hai "+getUmur,Toast.LENGTH_SHORT).show()


        btnHitung.setOnClickListener(){

            if(edtTahunLahir.text.length == 0){
                Toast.makeText(context,"Mohon Isi Tahun Lahir",Toast.LENGTH_SHORT).show()
            } else {
                var namaUser = getUmur
                var tahunLahir = edtTahunLahir.text.toString()
                var bund = Bundle()
                bund.putString("namaUser",namaUser)
                bund.putString("tahunLahir",tahunLahir)
                Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_fragmentHello,bund)
            }
        }

        ivProfile.setOnClickListener(){
            var bund = Bundle()
            bund.putString("namaUser",getUmur)
            Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_fragmentProfile,bund)
        }
    }
}