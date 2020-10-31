package com.t.listview_20201031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(student("조경진","서울시 은평구","1988"))
        mStudentList.add(student("구본아","서울시 용산구","1991"))
        mStudentList.add(student("김하은","인천시 연수구","1996"))
        mStudentList.add(student())
        mStudentList.add(student("조윤주","서울시 구로구","1996"))

    }
}