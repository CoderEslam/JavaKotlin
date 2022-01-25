import org.omg.CORBA.Object
import kotlin.collections.HashMap

class HashMaps {
}

fun main() {
    var  map = HashMap<String, Int>()
    map.put("age",24)
    map.put("name",2445)
    map.put("work",24455)
    map.put("eslam",245255)
    map.put("ali",25854)
    map.put("hossam",2884)

    for (i in map.keys){
        println(map[i])
    }
}