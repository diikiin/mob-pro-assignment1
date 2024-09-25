package exercise1

fun main() {
    forLoop()

    whileLoop()
}

fun forLoop() {
    println("This is for loop")
    for (i in 1..10) {
        println(i)
    }
}

fun whileLoop() {
    println("This is while loop")
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
}