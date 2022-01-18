import java.time.Year
import java.util.*

class findAge {
}

fun main() {

    var Y = readLine()!!.toInt();
    var M = readLine()!!.toInt();
    var D = readLine()!!.toInt();

//    var age  = 2022 - year
    var Y1  = Calendar.getInstance().get(Calendar.YEAR) - Y
    var M1  = Calendar.getInstance().get(Calendar.MONTH) - M
    var D1  = Calendar.getInstance().get(Calendar.DAY_OF_MONTH) - D


    print( " $Y1 , $M1 , $D1 ")

}