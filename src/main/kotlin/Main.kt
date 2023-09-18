fun main(args: Array<String>) {
    // 1: Khai bao bien
    // Immutable (val) va mutable (var)

    // 2: Kieu du lieu
    // Kieu so nguyen: Int, Long
    // Kieu so thuc: Float, Double
    // Kieu luan ly: Boolean (true, false)
    // Kieu chuoi: String

    // val name: String = "Pham Tan Phat"
    // var weight: Double = 70.5
    // var height: Float = 1.75f
    // var age = 29
    // var isMale = true

    // 3: Collections

    // List
    // Immutable list
    // val listNumbers = listOf<Int>()
    // Mutable list
    val listNumbers = mutableListOf<Int>()
    // Them phan tu
    listNumbers.add(10) // index = 0
    listNumbers.add(20) // index = 1
    listNumbers.add(30) // index = 2
    // Xoa phan tu
    listNumbers.removeAt(2)
    // Cap nhat phan tu
    listNumbers[0] = 9

    print(listNumbers.size.toString())
}