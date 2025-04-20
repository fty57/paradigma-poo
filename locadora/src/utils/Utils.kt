package utils

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Utils {
    fun formatarData(data: LocalDate): String{
        //val data = LocalDate.now()
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        return data.format(formatter)
    }
}