class Buku(var Judul: String, var Pengarang: String, var Penerbit: String, var Tahun: Int)

fun main(args: Array<String>) {
    val cetakBuku = Buku("Sang Pemimpi", "Andrea Hirata", "Bentang Pustaka", 2007)
    val cetakBuku2 = Buku ("Konsep & Perancangan DATABASE", "Ir. Harianto Kristanto", "Andi", 2004)

    println("Judul      : ${cetakBuku.Judul}")
    println("Pengarang  : ${cetakBuku.Pengarang}")
    println("Penerbit   : ${cetakBuku.Penerbit}")
    println("Tahun      : ${cetakBuku.Tahun}\n")

    println("Judul      : ${cetakBuku2.Judul}")
    println("Pengarang  : ${cetakBuku2.Pengarang}")
    println("Penerbit   : ${cetakBuku2.Penerbit}")
    println("Tahun      : ${cetakBuku2.Tahun}")
}



