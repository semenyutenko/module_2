// task_8
import java.util.*

fun main() {
    print("Укажите сумму вклада: ")
    var sum = readln().toDouble()
    print("Укажите длительность вклада (количество месяцев): ")
    val monthsAmount = readln().toInt()
    print("Укажите ежемесячный процент по вкладу: ")
    val rate = readln().toDouble()
    println()
    for (i in 1..monthsAmount ) {
        val income = sum / 100 * rate
        sum += income
        println("Месяц № $i - Сумма вклада увеличивается на ${String.format(Locale.US ,"%.2f", income)}" +
                "  Итоговая сумма: ${String.format(Locale.US ,"%.2f", sum)}")
    }
}