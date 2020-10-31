package adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.t.listview_20201031.R
import com.t.listview_20201031.student
import java.math.MathContext

class adapters (val mathContext: Context,
                val resId: Int,
                val mList: ArrayList<student>): ArrayAdapter<student>(mathContext,resId,mList) {

    val inf = LayoutInflater.from(mathContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item,null)
        }
        val row = tempRow!!

        return row
    }




}