import kotlin.time.measureTimedValue

class Mobil {
    var warna: String = ""
    var tahunProduksi: Int = 0
}
class Mobil2{
    var nyala: Int = 0
    var mati: Int = 0
    var gear: Int = 0

}

fun main() {
    //membuat Objek
    val mobilku = Mobil()
    val mobilku2 = Mobil2()

    //memanggil atribut dan memberi nilai
    mobilku.warna = "Hitam"
    mobilku.tahunProduksi = 2006
    mobilku2.gear = 1

    println("Warna: ${mobilku.warna}")
    println("Tahun: ${mobilku.tahunProduksi}")
    println("Gear: ${mobilku2.gear}")

}