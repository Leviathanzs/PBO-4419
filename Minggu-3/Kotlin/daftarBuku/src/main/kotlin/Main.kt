class buku(){
    var judul: String = ""
    var pengarang: String = ""
    var penerbit: String = ""
    var tahun: Int = 0

    // konstruktor
    constructor(judul: String, pengarang: String, penerbit: String, tahun: Int): this(){
        this.judul = judul
        this.pengarang = pengarang
        this.penerbit = penerbit
        this.tahun = tahun
    }

    // method
    fun cetakBuku(){
        println("Judul: $judul")
        println("Pengarang: $pengarang")
        println("Penerbit: $penerbit")
        println("Tahun: $tahun")
    }
}

fun main(args: Array<String>) {
    // create object buku
    val buku1 = buku("Pemrograman Berbasis Objek Dengan Java", "Indraiani", "Elexmedia Komputindo", 2007)
    buku1.cetakBuku()
    val buku2 = buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004)
    buku2.cetakBuku()
}



