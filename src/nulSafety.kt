import java.lang.Exception
import java.lang.NullPointerException

class nullSafety {
}

fun main() {
    println(23566)
    var name:String?  = null  // ? =>  mmkn y7ty 3la null aw laa
    try {
        println(name!!) // !! => mean didn't do nothing if it null
        name = "eslam"
        println(name)
    }catch (e:NullPointerException){
        println("Error  = " + e)
    }

}