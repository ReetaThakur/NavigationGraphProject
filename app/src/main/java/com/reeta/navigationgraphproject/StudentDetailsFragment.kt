package com.reeta.navigationgraphproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_student_details.*


class StudentDetailsFragment : Fragment(R.layout.fragment_student_details) {

    lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)
        btnNext.setOnClickListener {
            val name=edtName.text
            val bundle=Bundle()
            bundle.putString("name",name.toString())
            navController.navigate(R.id.action_studentDetailsFragment_to_studentProfessionsFragment
                ,bundle)

        }
    }

}