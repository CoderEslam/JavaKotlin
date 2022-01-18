class SipmleIF {
}


fun main() {
    var number:Int = readLine()!!.toInt()
    if (100>number && number>1){
        print(number)
    }




    when(number){
        2 -> print("2")
        3 -> print("3")
        4 -> print("4")
        in 5..10 -> print("5")
        !in 5..10 -> print("bigger")
        else-> print("too much")
    }

}