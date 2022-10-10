fun main() {
    val numberList = listOf(1, 3, 2, 6, 5, 4)
    val hackerChar = listOf('h', 'a', 'c', 'k', 'e', 'r')

    val ascendingShort1 = numberList.sortedDescending()
    val ascendingShort2 = hackerChar.sortedDescending()

    println(ascendingShort1)
    println(ascendingShort2)
}