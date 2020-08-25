//Valueof and Values
fun main() {
    val color: warna = warna.valueOf("RED")
    val colors: Array<warna> = enumValues()
    colors.forEach {warna ->
        println(warna) }
    println("Color is $color")


    }

enum class warna(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)

}
