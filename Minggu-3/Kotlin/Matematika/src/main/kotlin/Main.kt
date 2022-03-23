class Matematika {
    var tambah: Int = 0
    var kurang: Int = 0
    var kali: Int = 0
    var bagi: Int = 0

    fun pertambahan(x: Int, y: Int){
        tambah = x+y
        println("Pertambahan    : $x+$y=$tambah")
    }
    fun pengurangan(x: Int, y: Int){
        kurang = x-y
        println("Pengurangan    : $x-$y=$kurang")
    }
    fun perkalian(x: Int, y: Int){
        kali = x+y
        println("Perkalian      : $x*$y=$kali")
    }
    fun pembagian(x: Int, y: Int){
        bagi = x+y
        println("Pembagian      : $x/$y=$bagi")
    }
}

fun main(){
        val mat = Matematika()

        mat.pertambahan(20,20)
        mat.pengurangan(10,5)
        mat.perkalian(10,20)
        mat.pembagian(20,2)
}