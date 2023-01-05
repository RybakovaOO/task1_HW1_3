fun main() {
    val timeInSeconds = 14500
    val minutes = timeInSeconds / 60
    val hours = timeInSeconds / 60 / 60
    val days = timeInSeconds / 60 / 60 / 24

    fun agoToText(timeInSeconds: Int): String =
        when (timeInSeconds) {
            in 0..60 -> ("был(а) только что")
            in 61..3600 -> ("был(а) в сети $minutes ${toMinutes(minutes)} назад")
            in 3601..86400 -> ("был(а) в сети $hours ${toHours(hours)} назад")
            in 86401..172800 -> ("был(а) в сети вчера")
            in 172801..259200 -> ("был(а) в сети позавчера")
            else -> ("был(а) в сети давно")
        }
    println(agoToText(timeInSeconds))
}
fun toMinutes(minutes: Int): String =
    if (minutes % 10 == 1 && minutes % 100 != 11){
        ("минуту")
    }
    else if (minutes % 10 == 2|| minutes % 10 == 3|| minutes % 10 == 4){
        ("минуты")
    }
    else ("минут")

fun toHours(hours: Int): String =
if (hours % 10 == 1 && hours % 100 != 11){
    ("час")
}
else if (hours % 10 == 2|| hours % 10 == 3|| hours % 10 == 4){
    ("часа")
}
else ("часов")