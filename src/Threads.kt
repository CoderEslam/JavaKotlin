class Threads:Thread {

    var v:String? = "h"

    constructor(v: String) : super() {
        this.v = v
    }

    override fun run() {
//        super.run(
        var i  = 0
        while (i<10){
            println("${v} , $i")
            sleep(2000)
            i++
        }


    }



}


fun main() {


    var t = Threads("T1")
    t.start()
//    t.join()

    var t1 = Threads("T2")
    t1.start()
//    t1.join() // after finish one start second one

    var t2 = Threads("T3")
    t2.start()

}