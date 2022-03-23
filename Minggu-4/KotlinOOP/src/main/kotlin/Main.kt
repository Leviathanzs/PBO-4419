//superClass(Inheritance)
open class judul{
    var judul: String = "Universitas Dian Nuswantoro"
}

//subClass
class mahasiswa : judul(){
    //class function
    fun nama (nama: String) = println("Nama: $nama")
    fun nim (nim: String) = println("Nim: $nim")
    fun semester (semester: Int) = println("Semester: $semester")
    //memanggil judul dalam class people
    fun iniJudul(){
        println(judul)
    }
}
//contructor parameter
class faculty(var fakultas: String)

fun main(args: Array<String>) {
    //object
    val Mahasiswa = mahasiswa()
    //mengisi parameter constructor
    val Fakultas = faculty("Fakultas Ilmu Komputer")

    //memnaggil function
    Mahasiswa.iniJudul()
    println(Fakultas.fakultas)
    println("")
    Mahasiswa.nama("Oky Satria W")
    Mahasiswa.nim ("A11.2020.12674")
    Mahasiswa.semester(4)
}