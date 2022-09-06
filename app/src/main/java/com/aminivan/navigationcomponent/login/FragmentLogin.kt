package com.aminivan.navigationcomponent.login

import android.os.Bundle
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.navigation.Navigation
import com.aminivan.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_login.*

class FragmentLogin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvLupas.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentLupas)
        }

        tvRegisterLogin.setOnClickListener(){
                Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentRegister)
        }

        btnSubmit.setOnClickListener(){

            if(edtUsername.text.toString() == "aminivan" ||edtPassword.text.toString() == "123"){
                var dataUsername = edtUsername.text.toString()
                var bund = Bundle()
                bund.putString("username",dataUsername)

                Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentHome,bund)
            } else {
                Toast.makeText(context,"Username / Password Salah",Toast.LENGTH_SHORT).show()

            }


        }

        ivHelp.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentHelp)
        }

        ivChat.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentChat)
        }



        ivEyeOpen.setOnClickListener(){
            if(ivEyeClosed.isVisible == false){
                ivEyeClosed.isVisible = true
            } else {
                ivEyeOpen.isVisible = true
            }
        }

        ivEyeClosed.setOnClickListener(){
            if(ivEyeClosed.isVisible == true) {
                ivEyeClosed.isVisible = false
                ivEyeOpen.isVisible = true

            } else {
                ivEyeOpen.isVisible = true

            }
        }

    }




}