// task_11

val map = mapOf<Int, String>(
    1 to "Спиридонов Иван Фомич",
    2 to "Троценко Алексей Викторович",
    3 to "Смольянов Денис Александрович",
    4 to "Ваулина Наталья Георгиевна",
    5 to "Сенин Сергей Аркадьевич"
)

fun main() {
    try {
        print("Укажите номер рабочего места: ")
        val id = readln().toInt()
        if (map.containsKey(id)) {
            println("Рабочее место номер $id занимает: ${map[id]}")
        } else {
            println("Рабочего места с номером $id не существует.")
        }
    } catch (e: NumberFormatException) {
        println("Это некорректный ввод.")
    }
    println("Программа завершена.")
}