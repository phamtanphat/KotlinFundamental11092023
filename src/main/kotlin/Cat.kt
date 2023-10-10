class Cat(
    name: String,
    weight: Float,
    color: String,
    var speed: Float
): Animal(name, weight, color) {

    override fun printInfo() {
        println("""
            Name: $name
            Weight: $weight
            Color: $color
            Speed: $speed
        """.trimIndent())
    }
}