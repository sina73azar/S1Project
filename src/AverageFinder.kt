fun main() {
    //computeAverage()
/*    println("enter count of numbers you want average of:")
    val a= readLine()?.toInt()
    val arrayInt: Array<Int>? = a?.let { Array(it){ it->it} }
    for (i in 1..a!!) {
        println("enter num $i :")
        arrayInt?.set(i-1, readLine()?.toInt()!!)
    }*/
   // println(arrayInt?.let { computeAverageWithArray(it) })
    //other aproach to getting the inputs
    println("enter as much number you want one after other splited with space char")
    val inputs = readStrings().map { it.toInt() }
    var sum=0
    for (i in inputs) {
        sum+=i
    }
    println("Average is : ${sum/inputs.size}")
}
fun computeAverage() {
    var sum:Int=0
    repeat(20) {
        println("Enter a number: ")
        val num = readLine()?.toInt()
        if (num != null) {
            sum+=num
        }
    }
    println(sum/20)
}
fun computeAverageWithArray(array: Array<Int>): Double {
    var sum=0
    for (i in array) {
        sum+=i
    }
    return (sum/array.size).toDouble()
}
