fun main() {

    val timeOpen = 8
    val timeClose = 12
    val timeNow = 7

    val classStatus = if(timeNow >= timeClose) {
        "class already closed"
    } else if(timeNow >= timeOpen) {
        "class is open"
    } else {
        "class is not open yet"
    }
    println(classStatus)

}