open class Animal {
    var name: String = ""
    var weight: Float = 0.0f
    var color: String = ""

    constructor(name: String, weight: Float, color: String) {
        this.name = name
        this.weight = weight
        this.color = color
    }

    open fun printInfo() {
        println("""
            Name: $name
            Weight: $weight
            Color: $color
        """.trimIndent())
    }
}