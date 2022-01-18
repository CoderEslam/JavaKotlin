class Arrays {
}

fun main() {

    var array = Array<Int>(5){0}
    array[1] = 500
    array[3] = 300

    var JA = ArrayList<test>();
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))

    for (i in JA){
        println(i.toString())
    }

//    for (i in 0..array.size-1){
//        array[i] = readLine()!!.toInt()
//    }
//    for (i in array){
//        println(i)
//    }
}