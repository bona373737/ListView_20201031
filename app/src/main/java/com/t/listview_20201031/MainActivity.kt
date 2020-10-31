package com.t.listview_20201031

import adapters.adapters
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : adapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(student("조경진","서울시 은평구","1988"))
        mStudentList.add(student("구본아","서울시 용산구","1991"))
        mStudentList.add(student("김하은","서울시 구로구","1995"))
        mStudentList.add(student("박성윤","인천시 연수구","1996"))
        mStudentList.add(student("조윤주","서울시 구로구","1996"))
        mStudentList.add(student("아이유","서울시 금천구","1993"))
        mStudentList.add(student("박보검","서울시 강남구","1993"))
        mStudentList.add(student("차은우","서울시 도봉구","1997"))
        mStudentList.add(student("박보영","경기도 고양시","1990"))
        mStudentList.add(student("정우성","서울시 강북구","1973"))

        mAdapter = adapters(this, R.layout.student_list_item,studentListView)
        studentListView.adapter = mAdapter

    }
}