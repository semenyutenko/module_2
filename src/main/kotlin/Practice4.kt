// task_10

val cities = arrayListOf<String>()
var exit = false

fun main() {

    while (!exit) {
        println("""            
1. Добавить название города в программу
2. Посмотреть в консоли список всех добавленных городов
3. Посмотреть список добавленных городов без повторений
4. Выход из программы    
    """)
        print("Укажите номер операции: ")
        val operationNumber = readln()
        when (operationNumber) {
            "1" -> addCity()
            "2" -> showAllCityList()
            "3" -> showUniqueCityList()
            "4" -> exit()
            else -> println("Вы ввели: \"$operationNumber\". Это некорректное значение. Попробуйте ещё раз.")
        }
    }
}

fun addCity() {
    print("Введите название города: ")
    val city = readln()
    cities.add(city)
    println("Город $city добавлен")
}

fun showAllCityList() {
    println("Список всех городов:")
    println()
    for (city in cities) {
        println(city)
    }
}

fun showUniqueCityList() {
    println("Список городов без повторений:")
    println()
    val citySet = cities.toSet()
    for (city in citySet) {
        println(city)
    }
}

fun exit() {
    println("Программа завершена")
    exit = true
}
