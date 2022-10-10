fun main() {
    val grupMap = mapOf(
        1 to "Group 1",
        2 to "Group 2",
        3 to "Group 3",
        4 to "Group 4",
        5 to "Group 5",
        6 to "Group 6",
        7 to "Group 3",
    )
    println(grupMap)

    val mutableGrupMap = grupMap.toMutableMap()
    println(mutableGrupMap)

    mutableGrupMap[1] = "Grup satu"
    mutableGrupMap.put(8,"Grup 8")
    println(mutableGrupMap)
}