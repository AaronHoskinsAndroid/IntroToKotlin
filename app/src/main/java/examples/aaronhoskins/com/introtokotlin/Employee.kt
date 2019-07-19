package examples.aaronhoskins.com.introtokotlin

class Employee(var person : Person, var employeeId : String, var wage : Double)
    : Person(person.firstName, person.lastName, person.age) {

    constructor(firstName : String, lastName : String, age : Int, employeeId: String, wage: Double )
            : this(Person(firstName, lastName, age), employeeId, wage)
}