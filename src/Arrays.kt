class Arrays {
}

fun main() {

    var array = Array<Int>(5){0}
    array[1] = 500
    array[3] = 300

    var JA:ArrayList<test> = ArrayList<test>();
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("Eslam",23))
    JA.add(test("lknc",66));
    JA.set(1,test("Ghazy",23));   /*  ==  */  JA[1] = test("Alaa",23)



    for (i in JA){
        println(i.toString())
    }

    for (i in 0..JA.size-1){
        println(JA[i])
    }
    if (JA.contains(test(readLine()!!.toString(), readLine()!!.toInt()))){
        println("yes")
    }else{
        println("no")
    }

//    for (i in 0..array.size-1){
//        array[i] = readLine()!!.toInt()
//    }
//    for (i in array){
//        println(i)
//    }
}