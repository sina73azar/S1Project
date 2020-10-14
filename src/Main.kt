fun main() {
    println("Hello Kotlin")
/*    var name="ali"
    name="reza"
    print("test $name\n")
    val name1="sina"
    print(name1)*/
//    var name2:String
//    val num1:Long=12
//    println("$num1")
//    var numFloat=2.01254871211212f
//    var numFloat1=2.012548712122112
//    val num3=10_000_0000_00
//    println(numFloat)
//    println(numFloat1)
//    println(num3)
    //every type will start with uppercase
    //every type is class ...not having primitive type
    //val is like final in java
    //val cannot be reassigned
//    println("\"ali\"")
//    println("\"ali\\")
//    println("\"ali\$")
//    var rawString = """
//        ali  ali
//
//            ali 123123
//                        12321321
//    """.trimIndent()
    //Alt+Ctrl+L ---->reformat code
    //println("rawString length is ${rawString.length}")
//    val a=10
//    val b=29
//    println("sum of $a and $b is ${a+b}")
//
//    println("enter your full name:")
//    val name=readLine()
//    println("enter your year of birth in jalali calendar:")
//    var dateOfBirth= readLine()
//
//    println("Hello $name your age is ${1399-dateOfBirth!!.toInt()}")

    //get3DigitNum()
//    val floatArray:Array<Double> = arrayOf(1.1, 2.5,1.25798)
//    println(floatArray.size)
//    println(floatArray[2])

    val array1=Array(6){i->i*3}
    val array2=Array(10){i->"ali$i"}
    println(array2[5])
    println(array1[4])
    val array3=Array(8){"sina$it"}
    conditionStatement()
}
fun get3DigitNum() {
    println("Enter 3 digit number: ")
    var inputNum = readLine()
    println(inputNum!!.toInt()>200 && inputNum!!.toInt()<500)
}
fun conditionStatement() {
    var userPoint = readLine()!!.toInt()
    if (userPoint >= 70) {
        println("pass")
    } else {
        println("fail")
    }
}
