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

    var speed: String = ""
//    Secondary constructor
    constructor(name: String, weight: Float, color: String, speed: String) : this(name, weight, color) {
        this.speed = speed
    }

    fun doSomething(work: String): String {
        print("Do $work")
        return "Finish"
    }
}