class Mobil(){
    var warna: String = ""
    var tahun: Int = 0
    fun warna(warna: String){
        println("Warna: " + warna)
    }
    fun tahun(tahun: Int){
        println("Tahun: " + tahun)
    }
}
class Mobil2{
    var gear: Int = 0

    fun starter(mesin: Int){
        if (mesin == 1){
            println("Mesin Nyala")
        }
        else if(mesin == 0){
            println("Mesin Mati")
        }
        else{
            println("Error")
        }
    }

    fun changeGearUp(up: Int){
        gear = gear + up
        println("Gear: "+ gear)
    }
    fun changeGearDown(down: Int){
        gear = gear - down
        println("Gear: "+ gear)
    }
}

fun main() {
    //membuat Objek
    val mobilku = Mobil()
    val mobilDemo2 = Mobil2()

    //Memanggil method dan menunju nilai parameter
    mobilku.warna("Hitam")
    mobilku.tahun(2006)
    mobilDemo2.starter(1)
    mobilDemo2.changeGearUp(1)
    mobilDemo2.changeGearUp(1)
    mobilDemo2.changeGearDown(1)
    mobilDemo2.starter(0)
}