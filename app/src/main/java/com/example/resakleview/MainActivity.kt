package com.example.resakleview

import UserAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import list

class MainActivity : AppCompatActivity() {
    lateinit var userList: ArrayList<list>
    lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userList = ArrayList()
        for (i in 0..10) {
            userList.add(
                list(
                    "Bugatti",
                    "08.08.2021",
                    "300",
                    "https://i.pinimg.com/236x/48/00/29/4800294ec0750ea86639e7a5f53e9930.jpg"
                )
            )
            userList.add(
                list(
                    "Moto",
                    "28.01.2020",
                    "700",
                    "https://i.pinimg.com/236x/a8/53/4a/a8534a5cc7d32c7b12f70d9944cb482d.jpg"
                )
            )
        }

        userAdapter = UserAdapter(this, userList)
        rv.adapter = userAdapter


    }
}