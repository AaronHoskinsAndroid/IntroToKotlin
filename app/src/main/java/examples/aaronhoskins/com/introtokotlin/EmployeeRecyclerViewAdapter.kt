package examples.aaronhoskins.com.introtokotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.employee_item.view.*

class EmployeeRecyclerViewAdapter(val employeeList : ArrayList<Employee>)
    : RecyclerView.Adapter<EmployeeRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
            = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.employee_item, parent, false))
    override fun getItemCount() = employeeList.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int)
            = holder.setValues(employeeList[position])

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun setValues(employee: Employee){
            itemView.tvFirstName.text = employee.firstName
            itemView.tvLastName.text = employee.lastName
            itemView.tvAge.text = employee.age.toString()
            itemView.tvEmployeeId.text = employee.employeeId
            itemView.tvEmployeeWage.text = employee.wage.toString()
            itemView.setOnClickListener { itemView
                .context
                .startActivity(Intent(it.context, MainActivity::class.java)) }
        }
    }
}