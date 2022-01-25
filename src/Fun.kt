class Fun {
}


fun main() {
var  num = readLine()!!.toInt()
println(Show(num))
}

fun Show(num:Int) : String{
    if (num==1){
        return "Good Morning $num";
    }else if (num==2){
        return "Good after noon $num";
    }else if (num==3){
        return "Good night $num";
    }else{
        return "good to sleep $num";
    }
}