package exercise3

fun main() {
    println("Sum of two integers:")
    println(operation(5, 6) { x, y -> x + y })
    println("Product of two integers:")
    println(operation(5, 6) { x, y -> x * y })
}

fun operation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}