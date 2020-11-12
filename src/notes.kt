import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main(){
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    var today = LocalDate.now()
    var formattedToday = today.format(formatter)
    println(formattedToday)
    println("Enter your birth month: ")
    var birthMonth: Int = readLine()!!.toInt()

    println("Enter your birth day: ")
    var birthDay: Int = readLine()!!.toInt()

    var holdBirthday: LocalDate = LocalDate.of(year, birthMonth, birthDay)

    //println(holdBirthday.isBefore(today))
    if (holdBirthday.isBefore(today))
        //println("here")
        holdBirthday = holdBirthday.plusYears(1)

    val nextBirthday = holdBirthday.format(formatter)
    var daysToBirthday = today.until(holdBirthday, ChronoUnit.DAYS)

    if (daysToBirthday.toInt() == 0){
        println("Happy Birthday!")
    } else {
        println("Your next birthday is: $nextBirthday and there are $daysToBirthday until then.")
    }

}