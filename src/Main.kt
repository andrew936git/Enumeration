
fun main() {
//1
    val month = MonthName()
    println("Введите название месяца:")
    var i = 1
    while (i == 1) {
        month.createData()
        println("Продолжить - 1, Закончить - 2 ")
        i = readln().toInt()
    }
    println("===========================================")
//2
    val name = "Шумоизоляция".toCharArray()
    for (i in name.indices){
        var k = 0
        var j = i
        while (j < name.size ){
            if (name[i] == name[j]) k++
            j++
        }
        if (k > 1) println("Элемент \'${name[i]}\' повторяется $k раз")
    }
}