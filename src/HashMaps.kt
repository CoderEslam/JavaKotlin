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


    var  map1 = HashMap<Int, test>()
    map1.put(1,test("",55));
    map1.put(2,test("",55));
    map1.put(3,test("",55));
    map1.put(4,test("",55));
    map1.put(5,test("",55));
    map1.put(6,test("",55));
    map1.put(7,test("",55));

/*    map1.put(2,"dvfbb");
    map1.put(3,"dvvvf");
    map1.put(4,"dvvfrdgb");
    map1.put(5,"dvfvfv");
    map1.put(6,"ddvv");*/
    println(map1.values);


}