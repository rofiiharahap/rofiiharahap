
open class Manusia(nama:String, umur: Int? = 0){
    var nama = nama
    fun makan() {
        println("$nama sedang makan")
    }
}
class Murid(nama:String): Manusia(nama){

}fun main() {
    var murid = Murid("Rofii")
    murid.makan()
}