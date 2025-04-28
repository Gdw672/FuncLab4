import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Введите число: ")
    val number = scanner.nextInt()

    println("Делители числа $number:")

    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
}
