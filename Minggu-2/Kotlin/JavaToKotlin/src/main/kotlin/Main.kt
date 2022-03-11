class Mobil {
    var warna: String = ""
    var tahunProduksi: Int = 0
}
fun main(args: Array<String>) {
    //membuat Objek
    val mobilku = Mobil()

    //memanggil atribut dan memberi nilai
    mobilku.warna = "Hitam"
    mobilku.tahunProduksi = 2006

    println("Warna: ${mobilku.warna}")
    println("Tahun: ${mobilku.tahunProduksi}")
}