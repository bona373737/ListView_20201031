package adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.t.listview_20201031.R
import com.t.listview_20201031.student
import java.math.MathContext

class adapters (val mathContext: Context,
//                 어떤 화면에?
                val resId: Int,
//
                val mList: ArrayList<student>): ArrayAdapter<student>(mathContext,resId,mList) {
//                 어떤 목록을 뿌려줄까요?

    val inf = LayoutInflater.from(mathContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//                        뿌려줄 위치
        var tempRow = convertView
        if (tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item,null)
        }
        val row = tempRow!!
//        row가 바로 결과가 되지말고, 가공을 거친 후에 결과가 되게 하자

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)
//         row 변수 내부에 들어있는 요소들을 코틀린단으로 가져오자.

        val studentData = mList[position]
        naneTxt.text = studentData.name
        addressTxt.text = studentData.address

//        생년월을 가지고 그대로 코드작성하면 1991세 이런식으로 오류내용이 출력된다
//         ageTxt.text = "${studentData.birthYear}세"
//        알고리즘을 사용하여 생녀월일을 현재년도 기준의 실제 나이로 변환하는 작업 필요
//        나이: 현제년도 - 내생년월일 + 1
        val age = 2020 - studentData.birthYear + 1

        ageTxt.text = "${age}세"


        return row
    }




}