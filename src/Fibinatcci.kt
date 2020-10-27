fun main() {
    fibonatciFillArray()
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