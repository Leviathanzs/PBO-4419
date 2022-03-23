open class Mobil {
    fun warna(warna: String) = println("Warna: $warna")
    fun tahun(tahun: Int) = println("Tahun: $tahun")
}
class Mobil2 : Mobil() {
    var gear: Int = 0

    fun starter(mesin: Int) = when (mesin) {
        1 -> {
            println("Mesin Nyala")
        }
        0 -> {
            println("Mesin Mati")
        }
        else -> {
            println("Error")
        }
    }

    fun changeGearUp(up: Int){
        gear += up
        println("Gear: $gear")
    }
    fun changeGearDown(down: Int){
        gear -= down
        println("Gear: $gear")
    }
}

fun main() {
    //membuat Objek
    val mobilku = Mobil2()

    //Memanggil method dan menunju nilai parameter
    mobilku.warna("Hitam")
    mobilku.tahun(2006)
    mobilku.starter(1)
    mobilku.changeGearUp(1)
    mobilku.changeGearUp(1)
    mobilku.changeGearDown(1)
    mobilku.starter(0)
}