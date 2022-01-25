package inhert

import inhert.OOP.InnerC


interface Inter {

    fun sum(n1:Int,n2:Int):Int
    fun sub(n1:Int,n2:Int):Int

}

class OOP:Inter {

    var myName = "Ghazy"

    override fun sum(n1: Int, n2: Int): Int {
//        TODO("Not yet implemented")
        return n1+n2
    }

    override fun sub(n1: Int, n2: Int): Int {
//        TODO("Not yet implemented")
        return n1-n2

    }


    inner class InnerC{

        var name = myName
    }

}

fun main(args: Array<String>) {

    var oop = OOP()
    println(oop.sub(10,5))
//    var i = OOP.InnerC();
//    i.name ="EslamGhazy"
//    println(i.name)
    println(oop.myName)

}






