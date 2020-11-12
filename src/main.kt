import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main(){
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    //val today = LocalDate.of(year, 12, 31) I used this line to test out dates to make sure the while loop worked correctly
    val formattedToday = today.format(formatter) // formatted the dates to look nice
    println("Today is $formattedToday.")

    var soonestMoon: LocalDate = LocalDate.of(year, 11, 30) // included the soonest moon of the time making the code
    while (soonestMoon.isBefore(today)){
        soonestMoon = soonestMoon.plusDays(29) // have the loop add roughly 29 days until the date is after the current date
    }
    println("The soonest full moon will be on ${soonestMoon.format(formatter)}.")
}