package examples.aaronhoskins.com.introtokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val employeeList by lazy { createEmployeeList() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = EmployeeRecyclerViewAdapter(createEmployeeList())
        rvEmployeeList.layoutManager = LinearLayoutManager(this)
        rvEmployeeList.adapter = adapter
    }

    private fun createEmployeeList() : ArrayList<Employee>{
        val returnList = ArrayList<Employee>()

        returnList.add(Employee(Person("Aaron", "Hoskins", 37), "awesome666",1000000.01))
        returnList.add(Employee("William", "Hoskins", 8, "powerrangerblue11", 0.10))
        val person = Person("Brittany", "Toney", 32)
        returnList.add(Employee(person, "moneyhungeryb****", -500.00))
        return returnList
    }

}
