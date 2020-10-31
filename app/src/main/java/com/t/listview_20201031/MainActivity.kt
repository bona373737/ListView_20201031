package com.t.listview_20201031

import adapters.adapters
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.student_list_item.view.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : adapters

    val REQ_FOR_STUDENT_INFO = 1000

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

        studentListView.setOnItemClickListener { parent, view, position, id ->
//            pisiton : 눌린 위치가 어디인지 알려주는 역할
//
//
//            위치에 맞는 학생의 이름을 토스트로 출력 하기
            val clickedStudent = mStudentList[position]

            Toast.makeText(this, clickedStudent.name , Toast.LENGTH_SHORT).show()

            studentListView.setOnItemLongClickListener { parent, view, position, id ->

                val longclickedStd = mStudentList[position]
                Log.d("클릭이벤트",longclickedStd.name)

                Log.d("삭제전개수",mStudentList.size.toString())

                mStudentList.remove(longclickedStd)
//                학생을 삭제하자
//                mStudentList.removeAt(position)  해당 위치의 데이터 삭제

                return@setOnItemLongClickListener
            }
//            해당 줄을 길게 누려면 실행할 코드를 적는 공간
//            Boolen값으로 결과를 지정(return)해야함_안한 상태에서는 에러처리
        }

//        학생추가하기 버튼 이벤트
        makeNewstudBtn.seOn


    }
}