//class CData(val x:Int,val v:String) {
//    override fun toString(): String {
//        return "Data(x=$x, v='$v')"
//    }
//}

class CData{

    var age:Int = 0
    var name:String = ""
    var address:String = ""

    constructor( age: Int,name: String) {
        this.name = name
        this.age = age
    }

    constructor(age: Int, name: String, address: String) {
        this.age = age
        this.name = name
        this.address = address
    }

    override fun toString(): String {
        return "CData(age=$age, name='$name', address='$address')"
    }


}



