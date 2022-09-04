fun main() {
    println("**************************")
    println("GAME SUIT TERMINAL VERSION")
    println("**************************")
    println("Pilihan:\n1. Gunting\n2. Batu\n3. Kertas")

    print("Masukkan pilihanmu (1-3): ")
    val data1 = readln().trim()
    val data2 = (1..3).random().toString()
    println("Komputer memilih: $data2")

    val controller = Controller(object : Callback {
        override fun tampilanHasil(hasil: String) {
            println(hasil)
        }
    })
    controller.adu(data1, data2)
}