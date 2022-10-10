fun main() {
    val setItems = mutableSetOf(1, 2, 3, 5, 1, 4)
    // setItems[2] = 7 // can't change immutable set
    setItems.add(6) // add items at the end of the set
    setItems.remove(2) //remove items that have a value of 2

    println(setItems)
}