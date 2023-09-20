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
    // val listNumbers = mutableListOf<Int>()
    // Them phan tu
    // listNumbers.add(10) // index = 0
    // listNumbers.add(20) // index = 1
    // listNumbers.add(30) // index = 2
    // Xoa phan tu
    // listNumbers.removeAt(2)
    // Cap nhat phan tu
    // listNumbers[0] = 9
    // print(listNumbers.size.toString())

    // Set: Khong luu gia tri trung
    // Khai bao
    // val setPersons = mutableSetOf<String>()
    // Them du lieu
    // setPersons.add("Teo")
    // setPersons.add("Teo")
    // print(setPersons.size.toString())

    // Map
    // val mapProducts = mutableMapOf(
    //    "name" to "Ti",
    //    "age" to 5,
    //    "address" to "Quan 10"
    //)

    //print(mapProducts["name"])
    //print(mapProducts["age"])

    // 4: Toan tu
    // var a = 10
    // a = a + 1
    // a += 1
    // var b = a++ // a = 11
    // var c = ++a // a = 12

    // a++
    // Gan gia tri
    // Tang a them 1 don vi (a += 1)

    // ++a
    // Tang a them 1 don vi (a += 1)
    // Gan gia tri

    // print("B $b") // B = 10
    // print("C $c") // C = 12

    var a = 3
    var b = 5

    var result = a++ - b-- + --b - a-- + b++ - --a
    // 3 - b-- + --b - a-- + b++ - --a ; a = 4 , b = 5
    // 3 - 5 + --b - a-- + b++ - --a ; a = 4 , b = 4
    // 3 - 5 + 3 - a-- + b++ - --a ; a = 4 , b = 3
    // 3 - 5 + 3 - 4 + b++ - --a ; a = 3 , b = 3
    // 3 - 5 + 3 - 4 + 3 - --a ; a = 3 , b = 4
    // 3 - 5 + 3 - 4 + 3 - 2 ; a = 2 , b = 4
    // result = -2, a = 2, b = 4
}