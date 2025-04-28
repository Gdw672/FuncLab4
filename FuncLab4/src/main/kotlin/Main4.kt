import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Введите число: ")
    val number = scanner.nextInt()

    var evenCount = 0
    var oddCount = 0

    var tempNumber = number

    while (tempNumber != 0) {
        val digit = tempNumber % 10
        if (digit % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
        tempNumber /= 10
    }

    println("Количество четных цифр: $evenCount")
    println("Количество нечетных цифр: $oddCount")
}
