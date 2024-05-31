class MonthName(): CreateData {
    private var _nameOfMonth = ""
    var season = Season.WINTER
    var nameOfMonth: String
        set(value) {
            for (i in arrayOfMonth.indices) {
                if (arrayOfMonth[i] == value) {
                    _nameOfMonth = value
                    break
                }
            }
        }
        get() = _nameOfMonth

    private val arrayOfMonth = arrayOf("декабрь", "январь", "февраль", "март", "апрель",
        "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь")

    override fun createData(): Data {
        val name = readln()
        val monthName = MonthName()
        monthName.nameOfMonth = name
        when(name){
            "декабрь", "январь", "февраль" -> {
                season = Season.WINTER
                println("зима")
            }
            "март", "апрель", "май" -> {
                season = Season.SPRING
                println("весна")
            }
            "июнь", "июль", "август" ->  {
                season = Season.SUMMER
                println("лето")
            }
            "сентябрь", "октябрь", "ноябрь" -> {
                season = Season.AUTUMN
                println("осень")
            }
        }
        val data = Data(nameOfMonth, monthName.season)
        return data
    }
}
