open class Animal {
    var name: String = ""
    var weight: Float = 0.0f
    var color: String = ""
    protected var speed: String = ""

    constructor(name: String, weight: Float, color: String) {
        this.name = name
        this.weight = weight
        this.color = color
    }

    fun printInfoAnimal() {
        println("""
            Name: $name
            Weight: $weight
            Color: $color
        """.trimIndent())
    }
}