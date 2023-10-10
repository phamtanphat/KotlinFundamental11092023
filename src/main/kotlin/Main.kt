fun main(args: Array<String>) {
//     1: Khai bao bien
//     Immutable (val) va mutable (var)
//
//     2: Kieu du lieu
//     Kieu so nguyen: Int, Long
//     Kieu so thuc: Float, Double
//     Kieu luan ly: Boolean (true, false)
//     Kieu chuoi: String
//     Kieu doi tuong: Class
//
//     val name: String = "Pham Tan Phat"
//     var weight: Double = 70.5
//     var height: Float = 1.75f
//     var age = 29
//     var isMale = true
//
//     3: Collections
//
//     List
//     Immutable list
//     val listNumbers = listOf<Int>()
//     Mutable list
//     val listNumbers = mutableListOf<Int>()
//     Them phan tu
//     listNumbers.add(10) // index = 0
//     listNumbers.add(20) // index = 1
//     listNumbers.add(30) // index = 2
//     Xoa phan tu
//     listNumbers.removeAt(2)
//     Cap nhat phan tu
//     listNumbers[0] = 9
//     print(listNumbers.size.toString())
//
//     Set: Khong luu gia tri trung
//     Khai bao
//     val setPersons = mutableSetOf<String>()
//     Them du lieu
//     setPersons.add("Teo")
//     setPersons.add("Teo")
//     print(setPersons.size.toString())
//
//     Map
//     val mapProducts = mutableMapOf(
//        "name" to "Ti",
//        "age" to 5,
//        "address" to "Quan 10"
//    )
//
//    print(mapProducts["name"])
//    print(mapProducts["age"])
//
//     4: Toan tu
//     var a = 10
//     a = a + 1
//     a += 1
//     var b = a++ // a = 11
//     var c = ++a // a = 12
//
//     a++
//     Gan gia tri
//     Tang a them 1 don vi (a += 1)
//
//     ++a
//     Tang a them 1 don vi (a += 1)
//     Gan gia tri
//
//     print("B $b") // B = 10
//     print("C $c") // C = 12
//
//     var a = 3
//     var b = 5
//
//     var result = a++ - b-- + --b - a-- + b++ - --a
//     3 - b-- + --b - a-- + b++ - --a ; a = 4 , b = 5
//     3 - 5 + --b - a-- + b++ - --a ; a = 4 , b = 4
//     3 - 5 + 3 - a-- + b++ - --a ; a = 4 , b = 3
//     3 - 5 + 3 - 4 + b++ - --a ; a = 3 , b = 3
//     3 - 5 + 3 - 4 + 3 - --a ; a = 3 , b = 4
//     3 - 5 + 3 - 4 + 3 - 2 ; a = 2 , b = 4
//     result = -2, a = 2, b = 4
//     print("result = $result, a = $a, b = $b")
//
//     5: Cau dieu kien (if else)
//
//     var a = 5
//     var b = 10
//
//     Neu a lon b: In ra a lon b
//     Neu a nho b: In ra a nho b
//     Neu a bang b: In ra a bang b
//
//     {} : scope (Pham vi)
//     () : chua bieu thuc
//
//     if (a > b) {
//        print("A lon hon b")
//     } else if (a == b) {
//        print("A bang b")
//     } else {
//        print("A be hon b")
//     }
//
//     Vi du: Tinh BMI

//    val weight = 70.5
//    val height = 1.75
//    val bmi = weight / (height * height)

//     && => Chi dung khi va chi khi tat ca deu dung
//     || => Chi sai khi tat ca deu sai

//    if (bmi < 18.5) {
//        print("Can nang thap (gay)")
//    } else if (bmi <= 24.9) {
//        print("Can nang binh thuong")
//    } else if (bmi == 25.toDouble()) {
//        print("Can nang binh thuong")
//    } else if (bmi <= 29.9) {
//        print("Tien beo phi")
//    } else if (bmi <= 34.9) {
//        print("Tien beo phi do 1")
//    } else if (bmi <= 39.9) {
//        print("Tien beo phi do 2")
//    } else {
//        Case bmi >= 40
//        print("Tien beo phi do 3")
//    }

//    Su dung if else co gia tri tra ve
//    alt + enter: phim goi y sua loi
//    Khi khai báo các biến có miền giá trị như bên dưới
//      YES / NO
//      ON / OFF
//      TRUE / FALSE
//   thêm is phía trước tên biến => isChecked
//    var checkBox = true // Example: Dang kiem tra trang thai check cho CheckBox
//    var isChecked = if (checkBox) {
//        print("Hello")
//        true
//    } else {
//        false
//    }

//     5: Cau dieu kien (when)
//    when(month) {
//        in 1..5 -> Trường hợp trong khoảng
//        5 -> Trường hợp giá trị cụ thể
//        0, 1, 2, 5 -> Trường hợp cho nhiều giá trị cụ thể
//        is Int -> Trường hợp kiểu dữ liệu
//    }

//    val month = 5
//    val message = when(month) {
//        in 1..3 -> "Quý 1"
//        in 4..6 -> "Quý 2"
//        in 7..9 -> "Quý 3"
//        in 10..12 -> "Quý 4"
//        else -> "Khong xac dinh"
//    }
//    print(message)

//    6: Vong lap for

//     Vong lap trong khoang 0<= value <= 100
//     for (value in 0..100)
//     Vong lap trong khoang 0<= value < 100
//     for (value in 0 until 100)
//     Vong lap co buoc nhay la 2
//     for (value in 0 until 100 step 2)
//     Vong lap duyet nguoc
//     for (value in 100 downTo 0)
//     Vong lap co index
//     val listNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//     for ((index, number) in listNumbers.withIndex()) {
//
//     }
//
//     for ((index, number) in (1..100).withIndex()) {
//
//    }

    // Vi du: Vong lap chay tu 0 den 100
    // 1: In ra so chan => So chan la nhung so chia het cho 2
    // 2: In ra so le => So le la nhung so khong chia het cho 2
    // 3: In ra so chia 3 du 1
    // 4: In ra so chinh phuong

//    for (value in 0 .. 100) {
//        Dieu kien in ra so chan
//        if (value % 2 == 0) {
//            println(value)
//        }

//        Dieu kien in ra so le
//        if (value % 2 != 0) {
//            println(value)
//        }

//        Dieu kien in so chia 3 du 1
//        if (value % 3 == 1) {
//            println(value)
//        }

//        Dieu kien in so chinh phuong
//        continue bỏ qua vòng lặp hiện tại để chạy vòng tiếp theo (Sử dụng cho vòng lặp)
//        break dùng để thoát vòng lặp (Sử dụng cho vòng lặp)
//        return thì dùng kết thúc 1 function
//        if (value == 0) continue
//        if (value >= 10) break
//        val result = sqrt(value.toFloat())
//        if (result % 1.0f == 0.0f) {
//            println(value)
//        }
//    }

//     Vi du kiem tra phai la so nguyen to
//     val number = 1959

//    if (number <= 1) {
//        println("Số $number không phải là số nguyên tố")
//        return
//    }

//    var totalDivisor = 1
    // Number > 1
//    for (value in 2..<number) {
//        if (number % value == 0) {
//            totalDivisor++
//            if (totalDivisor >= 3) {
//                println("Số $number không phải là số nguyên tố")
//                return
//            }
//        }
//    }
//
//    print("Số $number là số nguyên tố")

    // 7: Vong lap while

//    var count = 10
//    while (count > 0) {
//        count--
//        println("Số lần hiển thị: $count")
//    }

    // do while
//    Math.random()
//    var number = (Math.round(Math.random() * 5) + 5).toInt()
//    var count = 0
//    do {
//        if (number == 5) {
//            count++
//            println("Số vòng lặp để kiếm được giá trị là 5 là $count")
//            break
//        }
//        println("Số random được $number")
//        count++
//        number = (Math.round(Math.random() * 5) + 5).toInt()
//    } while (true)

    // 8: Huong doi tuong (OOP)
    // class va object

    // Các tính chất trong OOP

    // Tính đóng gói
//    val cat: Animal = Animal("Mimi", 3.3f, "white")
    val cat: Cat = Cat("Mimi", 3.3f, "white", 2.5f)
    cat.printInfo()
}
