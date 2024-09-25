package exercise2

class BankAccount {

    private var balance = 0

    fun deposit(amount: Int) {
        balance += amount
    }

    fun withdraw(amount: Int) {
        if (balance >= amount) {
            balance -= amount
        } else {
            println("Balance can't be negative")
        }
    }
}