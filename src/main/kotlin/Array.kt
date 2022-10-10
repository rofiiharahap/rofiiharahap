fun main() {

    val groups = arrayOf<String>("Group 1", "group 2", "group 3", "group 4")

    println( groups[0] )
    println( groups.get(1) )
    println("------------------")

    groups[0] = "Group Satu"
    groups.set(1, "Group Dua")

    println( groups[0])
    println( groups.get(1))
    println( groups.get(2))
}