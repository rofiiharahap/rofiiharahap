fun main () {

    val timeClose = 8
    val timeNow = 8

    val isClosed = if(timeNow >= timeClose) "Class already closed" else "Clean is open"

    println(isClosed)

}