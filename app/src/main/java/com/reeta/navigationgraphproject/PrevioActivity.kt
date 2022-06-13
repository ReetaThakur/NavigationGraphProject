package com.reeta.navigationgraphproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.navArgument
import kotlinx.android.synthetic.main.activity_previo.*

class PrevioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previo)
        intent?.run {
            tvName.text=getStringExtra("name")
            tvAge.text="${getIntExtra("age",4)}"
        }
    }
}