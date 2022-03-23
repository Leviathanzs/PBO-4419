//superClass(Inheritance)
open class people{
    var judul: String = "Universitas Dian Nuswantoro"
}

//subClass
class mahasiswa : people(){
    //class function
    fun nama (nama: String) = println("Nama: $nama")
    fun nim (nim: String) = println("Nim: $nim")
    fun semester (semester: Int) = println("Semester: $semester")

    class dosen {
        //class function
        fun nama (nama: String) = println("Nama: $nama")
        fun nim (nim: String) = println("Nim: $nim")
    }
    fun iniJudul(){
        println(judul)
    }
}
//contructor parameter
class faculty(var fakultas: String)

fun main(args: Array<String>) {
    //object
    val Mahasiswa = mahasiswa()
    val Dosen = mahasiswa.dosen()
    //mengisi parameter constructor
    val Fakultas = faculty("Fakultas Ilmu Komputer")

    //memnaggil function
    Mahasiswa.iniJudul()
    println(Fakultas.fakultas)
    println("")
    Mahasiswa.nama("Oky Satria W")
    Mahasiswa.nim ("A11.2020.12674")
    Mahasiswa.semester(4)
    println("")
    Dosen.nama("Mr.k")
    Dosen.nim("S11.2010.21342")

}