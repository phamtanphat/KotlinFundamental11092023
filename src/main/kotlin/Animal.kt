class Animal (
    var name: String,
    var weight: Float,
    var color: String
) {
//     1: Thuoc tinh
//    var name: String = ""
//    var weight: Float = 0.0f
//    var color: String = ""
//     2: Phuong thuc

    fun printInfoAnimal() {
        println("""
            Name: $name
            Weight: $weight
            Color: $color
        """.trimIndent())
    }

}