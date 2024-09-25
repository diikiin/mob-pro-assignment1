package exercise1

fun main() {
    val positive = -1
    val zero = 10
    val negative = 0

    checkNumber(positive)
    checkNumber(zero)
    checkNumber(negative)
}

fun checkNumber(n: Int) {
    if (n > 0) {
        println("positive")
        return
    }
    if (n < 0) {
        println("negative")
        return
    }

    println("zero")
}