// task_9
// не уверен, что правильно понял задание
fun main() {
    val attributes: Array<Array<String>> = arrayOf(
        arrayOf("Сербия", "США", "Нидерланды", "Россия"),
        arrayOf("Белград", "Вашингтон", "Амстердам", "Москва"),
        arrayOf("RSD", "USD", "EUR", "RUB")
    )
    for (i in 0 until attributes[0].size) {
        for (j in 0..2) {
            print("${attributes[j][i]} ")
        }
        println()
    }
}