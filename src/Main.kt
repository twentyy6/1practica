fun main(){
    // 1 Задание
    println("---1 Задание---")
    val age:Int = 52
    val name:String = "Oleg"
    val isStudent: Boolean = false
    val height: Double = 1.82
    println(age)
    println(name)
    println(isStudent)
    println(height)
    // 2 Задание
    println("---2 Задание---")
    val number: Double = 3.14159
    val formattedNumber: String = String.format("%.6f", number)
    println(formattedNumber)
    // 3 Задание
    println("---3 Задание---")
    val e: Double = Math.E
    val formattedE: String = String.format("%.3f", e)
    println(formattedE)
    // 4 Задание
    println("---4 Задание---")
    println("Сколько вам лет?:")
    val Stringinput = readLine()
    println("Вы ввели число: $Stringinput")
    // 5 Задание
    println("---5 Задание---")
    println("Введите число:")
    val input = readLine()
    println("$input — вот какое число Вы ввели")
    // 6 Задание
    println("---Задание 6---")
    println("1 13 49")
    // 7 Задание
    println("---Задание 7---")
    println("7  15  100") // ( не особо понял 6 и 7 задание)
    // 8 Задание
    println("---8 Задание---")
    val Intnum1 = 42
    val Intnum2 = 52
    val Intnum3 = 33
    println("${Int}num1  ${Int}num2  ${Int}num3")
    // 9 Задание
    println("---9 Задание---")
    val num1 = 9
    val num2 = 0
    val num3 = 13
    val num4 = 87
    println("$num1 $num2 $num3 $num4")
    // Задание 10
    println("---Задание 10---")
    val Longnum1 = 50
    val Longnum2 = 10
    println(num1)
    println(num2)
    // Задание 11
    println("---Задание 11---")
    val Shortnum1 = 5
    val Shortnum2 = 10
    val Shortnum3 = 21
    println(num1)
    println(num2)
    println(num3)
    // Задание 12
    println("Задание 12")
    val Bytenum1 = 1
    val Bytenum2 = 2
    val Bytenum3 = 3
    val Bytenum4 = 4
    println(num1)
    println(num2)
    println(num3)
    println(num4)
}