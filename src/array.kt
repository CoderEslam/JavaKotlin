class array {



}

fun main(args: Array<String>) {
    var a: ArrayList<String> = ArrayList<String>()
    a.add("Eslam");
    a.add("Ghazy");
    a.add("Alaa");
    a.add("ali");
    a.add("mona");
    a.add("oumnia");

    for (x in a) {
        for (i in x) {
            println("$i = ${i.toInt()}");
        }
    }

    var c: ArrayList<CData> = ArrayList<CData>()

    c.add(CData(5,"Eslam"))
    c.add(CData(10,"Ghazy"))
    c.add(CData(25,"ALi"))
    c.add(CData(33,"Ahmed"))
    c.add(CData(55,"Osama"))
    c.add(CData(362,"mohammed"))
    c.add(CData(255,"mona"))
    c.add(CData(2556,"Alaa"))

    var cData:ArrayList<CData> = ArrayList();
    cData.add(CData(23,"Islam","Alex"))
    cData.add(CData(23,"Aslam","Alex"))
    cData.add(CData(23,"Eslam","Alex"))
    cData.add(CData(23,"Eslam","Alex"))
    cData.add(CData(23,"Eslam","Alex"))
    cData.add(CData(23,"Eslam","Alex"))
//    print(c)

    for (i in c){
        println("${i.name}")
    }


    for (i in cData){
        println("${i}")
    }

}

fun m(){

    println("dvklsdNSVjsk")

}