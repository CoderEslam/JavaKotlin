package inhert

 open class Operation {

    internal var  v = "Eslam";
     fun Sum(v1:Double,v2:Double):Double{
        v="Ghazy"
        return v1+v2;

    }

    open fun Sub(v1:Double,v2:Double):Double{
        return v1-v2;
    }


}

class MulOperation(): Operation() {

    fun Mul(v1:Double,v2:Double):Double{
        return v1*v2;
    }

    fun Div(v1:Double,v2:Double):Double{
        return v1/v2;
    }

    // Alt + insert
    override fun Sub(v1: Double, v2: Double): Double {
        return super.Sub(v1, v2-1)
    }

    fun t(){
        Sum(4.0,6.9)
        v = "sSSS"
    }


}

fun main() {

    var p = MulOperation()
//    println(p.Sum(5.0,6.0))
    println(p.Sub(10.0,6.0))
//    println(p.Div(5.0,6.0))
//    println(p.Mul(5.0,6.0))



}