// task_7
fun main() {
    val tickets: List<Ticket> = listOf(
        Ticket("rhino", listOf<String>("лев", "буйвол", "носорог", "обезьяна"), 3),
        Ticket("village", listOf<String>("город", "деревня", "страна", "континент"), 2),
        Ticket("car", listOf<String>("корабль", "самолёт", "поезд", "машина"), 4),
        Ticket("carrot", listOf<String>("морковь", "капуста", "тыква", "томат"), 1),
        Ticket("winter", listOf<String>("весна", "лето", "осень", "зима"), 4))

    var mark = 0
    for (ticket in tickets) {
        println("Как переводится слово - ${ticket.question}")
        println()
        for (n in 1..4) {
            println("$n - ${ticket.options.get(n - 1)}")
        }
        print("Укажите номер ответа: ")
        val answer = readln().toInt()
        if (answer == ticket.answer) {
            println("Верно")
            mark++
        } else {
            println("Неверно")
        }
    }
    println()
    print("Тест окончен. ")
    when(mark) {
        0 -> println("Вы безнадёжны.")
        1 -> println("Ваша оценка - кол.")
        2 -> println("Ваша оценка - несчастная двойка.")
        3 -> println("Ваша оценка - скромная тройка.")
        4 -> println("Ваша оценка - твёрдая четвёрка.")
        5 -> println("Ваша оценка - отлично. Поздравляем!")
    }
}

class Ticket(question: String, options: List<String>, answer: Int) {
    val question: String
    val options: List<String>
    val answer: Int
    init {
        this.question = question
        this.options = options
        this.answer = answer
    }
}