package com.t.listview_20201031

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EditStudentInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_student_info)

        okBtn.setOnClickListener {
//            1 입력한 항목 받아내기
            val inputName = nameEdt.text.tostring()
            val largeArea = lagerAreaEdft.text.tostring()
            val smallArea = smallAreaEdt.text.tostring()
//
//            년수는 정수int 형태로 저장하는게 편리하다
//            입력문구text -> string변환 -> int변환

            val birthYear = birthYear.text.tostring().toInt()
//
//            2.결과로써 설정 + 확인을 누른게 맞다
            val resultIntent = intent()
            resultIntent.putExtra("name",inputName)
            resultIntent.putExtra("largeArea",largeArea)
            resultIntent.putExtra("smallArea",smallArea")
//            하나의 intent에 여러개의 데이터를 putExtra해도 무방함

            setResult(Activity.RESULT_OK,resultIntent)

//            3. 이전화면으로의 복귀
            finish()



        }
    }
}