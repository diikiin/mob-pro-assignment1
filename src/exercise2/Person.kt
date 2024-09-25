package exercise2

open class Person {

    var name: String = ""
    var age: Int = 0
    var email: String = ""

    open fun displayInfo() {
        println("Name: $name, Age: $age, Email: $email")
    }
}