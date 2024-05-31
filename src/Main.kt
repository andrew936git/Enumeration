
fun main() {
    val month = MonthName()
    println("Введите название месяца:")
    var i = 1
    while (i == 1) {
        month.createData()
        println("Продолжить - 1, Закончить - 2 ")
        i = readln().toInt()
    }
}