class Buku (var Judul: String, var Pengarang: String, var Penerbit: String, var Tahun: Int)

fun main(args: Array<String>) {
    val cetakBuku = Buku("PBO", "Indra", "Elex", 2007)
    val cetakBuku2 = Buku ("Java", "Ajib", "Andi", 2007)

    println("Judul      : ${cetakBuku.Judul}")
    println("Pengarang  : ${cetakBuku.Pengarang}")
    println("Penerbit   : ${cetakBuku.Penerbit}")
    println("Tahun      : ${cetakBuku.Tahun}\n")

    println("Judul      : ${cetakBuku2.Judul}")
    println("Pengarang  : ${cetakBuku2.Pengarang}")
    println("Penerbit   : ${cetakBuku2.Penerbit}")
    println("Tahun      : ${cetakBuku2.Tahun}")
}



