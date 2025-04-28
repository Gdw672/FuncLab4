import java.util.Scanner

fun main() {
    val randomNumber = (1..9).random()
    val scanner = Scanner(System.`in`)

    println("Угадайте число от 1 до 9.")

    while (true) {
        print("Введите ваше число: ")
        val userInput = scanner.nextInt()

        if (userInput == randomNumber) {
            println("Поздравляю, вы угадали число!")
            break
        } else {
            println("Неверно, попробуйте снова.")
        }
    }
}
