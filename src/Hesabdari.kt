fun main() {
    println("Investment:")
    val investment=readLn().toInt()

    println("Expence(s):")
    val expences = readInts()
    var sumExp=0
    for (item in expences) {
        sumExp+=item
    }

    println("Income:")
    val income=readLn().toInt()

    //compute remaining income
    println("Remaining income: ${investment+income-sumExp}")

}

fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints


