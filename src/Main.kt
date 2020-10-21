fun main() {

    var a = 0
    while (a < 5) {

        //classCodeQuera()
        //starPrint()
        //println("Enter number :")
        //val input= readLine()!!.toInt()
        //println(recursiveFun(input))
        //calc()
        ++a

    }
    println(
            computeStringLength("ali", "mamad"))
    //fibonatci()
    //fibonatciFillArray()
    //multiDimArray()
}

fun starter() {
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

//    val floatArray:Array<Double> = arrayOf(1.1, 2.5,1.25798)
//    println(floatArray.size)
//    println(floatArray[2])
}

fun get3DigitNum() {
    println("Enter 3 digit number: ")
    var inputNum = readLine()
    println(inputNum!!.toInt() > 200 && inputNum.toInt() < 500)
}

fun conditionStatement() {
    println("Enter your Score")
    var userPoint = readLine()!!.toInt()
//    if (userPoint > 100) {
//        println("enter under 100")
//    } else if (userPoint > 80) {
//        println("top player")
//    } else if (userPoint > 50)
//        println("passed")
//    else if (userPoint > 30)
//        println("condition pass")
//    else
//        println("fail")
    var status: String
    status = if (userPoint in 80..100) "top"
    else if (userPoint in 50..80) "passed"
    else if (userPoint in 30 until 50) "condition passed"
    else "fail"
    println(status)
}

fun arrayBuild() {
    val array1 = Array(6) { i -> i * 3 }

    val array2 = Array(10) { i -> "ali$i" }
    println(array2[5])
    println(array1[4])
    val array3 = Array(8) { "sina$it" }
}

fun kotlinIfAdvantage() {
    var name: String
    val num = readLine()!!.toInt()
    name = if (num == 1) "sina" else if (num == 0) "javad" else "ghader"
    println(name)

}

fun testOfWhen() {
    println("Enter number")
    var num = readLine()!!.toInt()
    var outputNumber: String
    outputNumber = when (num) {
        1 -> {
            println("testi")
            "one"
        }
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        6, 7, 8 -> "six"
        else -> "yechi dige"
    }
    println(outputNumber)
}

fun testOfWhen2() {
    println("Enter number")
    var num = readLine()!!.toInt()
    when (num) {
        in 1..5 -> println("one to five")
        in 5..10 -> println("five to ten")
    }
}

fun forTest() {
    /*   for (i in 1..1000) {
           if (i % 2 == 0) {
               println(i)
           }
       }*/
/*    for (i in 1..500)
        println(i*2)*/
//    for (i in 2..1000 step 2)
//        println(i)
//    for (i in 1400 downTo 110 step 5) {
//        println("num $i")
//    }
/*    for (name in 0..2) {
        println(arrayOfNames[name])
    }*/
//    for (name in arrayOfNames) {
//        println(name)
//    }
    var arrayOfNames = arrayOf("sina", "ali", "reza", "mahtab")
    for (index in arrayOfNames.indices) {
        println("$index is ${arrayOfNames[index]}")
    }
//    var i=1
//    while (i < 500) {
//        println(i * 2)
//        ++i
//    }
/*    var i=2000
    do {
        i++
        println(i)
    }while (i<1000)*/
//    var i=0
//    do {
//        ++i
//        println(i*2)
//    }while (i<500)

    //task : fibonatcci sequence 20 number

}

fun conAndBreakSample() {
    var i = 0
    while (i < 100) {
        i++
        if (i % 5 == 0) continue
        println(i)
    }
    repeat(30) {
        println(it)
    }

}

fun starPrint() {
    println("Enter number of Star rows:")
    val rows = readLine()!!.toInt()
    for (i in 1..rows) {
        for (j in 1..i) {
            print("*")
        }
        print("\n")
    }
}

//Question:how can we fill an empty array?
fun fibonatci() {
    //this function not using array for fibonatci
    println("Enter count of numbers of fibonatci you need?")
    val countFib = readLine()!!.toInt()
    var fn = 0
    var fnPlus = 1
    var fnPlusPlus: Int
    print("$fn\t\t")
    print("$fnPlus\t\t")
    for (i in 1..countFib - 2) {
        fnPlusPlus = fn + fnPlus
        print("$fnPlusPlus\t\t")
        if (i == 8) println("")
        if (i > 18) {

            if (i % 10 == 0) println("")
        }
        fn = fnPlus
        fnPlus = fnPlusPlus
    }


}

fun fibonatciFillArray() {
    println("Enter count of numbers of fibonatci you need?")
    val arraySize = readLine()!!.toInt()
    var arrayFib = Array(arraySize) { it }
    arrayFib[0] = 0
    arrayFib[1] = 1
    for (a in 2 until arraySize) {
        arrayFib[a] = arrayFib[a - 1] + arrayFib[a - 2]
    }
    for (a in arrayFib)
        println(a)
}

fun classCodeQuera() {
    for (i in 1..100) {
        print(i)
    }
    println("Enter Index you want")
    val k = readLine()!!.toInt()
    var d: String
    when {
        k < 10 -> println(k)
        k < 100 && k % 2 == 0 -> println((10 + ((k - 10) / 2)).toString()[0])
        k < 100 && k % 2 == 1 -> println((10 + ((k - 11) / 2)).toString()[1])

    }


}

fun multiDimArray() {
    var multiDimArray = arrayOf(
            intArrayOf(5, 4, 98), intArrayOf(2, 32, 36, 45, 74), intArrayOf(8)
    )
    for (num in multiDimArray) {
        println(num)
        for (num2 in num) {
            println(num2)
        }
    }
}
fun calc() {
    var c:Double=0.0
    print("A= ")
    val a= readLine()!!.toDouble()
    print("B= ")
    val b= readLine()!!.toDouble()
    print("Enter the operator:(+,-,*,/)")
    val operator= readLine()
    when (operator) {
        "+" ->c=a+b
        "-" ->c=a-b
        "*" ->c=a*b
        "/" ->c=a/b
    }
    println(c)

}
fun recursiveFun(num: Int): Long {
    return if(num==1) 1 else num * recursiveFun(num - 1)
}
fun computeStringLength(str1: String, str2: String): Int {
    val sum = str1.length + str2.length
    return sum
}