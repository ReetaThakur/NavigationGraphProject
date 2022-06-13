package com.reeta.navigationgraphproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import kotlinx.android.synthetic.main.fragment_student_professions_.*

class StudentProfessionsFragment : Fragment(R.layout.fragment_student_professions_) {

    lateinit var name:String
   // var float:Float=0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.run {
            name=getString("name")!!
          //  float=getFloat("float")
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnNextActivity.setOnClickListener {
            val age=edtAge.text
            val intent=Intent(context,PrevioActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("age",age.toString())
            startActivity(intent)

        }
    }

}