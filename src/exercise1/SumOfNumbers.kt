package exercise1

fun main() {
    val numbers = listOf(1,2,3,4,5)
    var sum = 0

    for (number in numbers) {
        sum += number
    }

    println(sum)
}