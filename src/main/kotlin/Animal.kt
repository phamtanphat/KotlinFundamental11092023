class Animal {
//     1: Thuoc tinh
//    var name: String = ""
//    var weight: Float = 0.0f
//    var color: String = ""
//     2: Phuong thuc

//    Secondary constructor
    var name: String = ""
    var weight: Float = 0.0f
    var color: String = ""
    var speed: String = ""

    constructor(name: String, weight: Float, color: String, speed: String) {
        this.name = name
        this.weight = weight
        this.color = color
        this.speed = speed
    }

    constructor(speed: String) {
        this.speed = speed
    }

    constructor(color: String, speed: String) {
        this.color = color
        this.speed = speed
    }
}