package exercise2

class Employee : Person() {

    private var salary: Int = 0

    override fun displayInfo() {
        println("Name: $name, Age: $age, Email: $email, Salary: $salary")
    }
}