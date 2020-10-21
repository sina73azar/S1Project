import java.lang.StringBuilder

fun main() {
    repeat(5) {
        println("Enter a number:")
        val inputStr: String? = readLine()
        if (inputStr != "") {
            val inputNumber = inputStr?.toInt()
            if (inputNumber != null) {
                //execute Methods
                println(isPrime(inputNumber))
                println(getAllMaghsoomElaih(inputNumber))
            } else {
                println("the input num is null")
            }
        }else
            println("nothing entered...try again")

    }

}

fun isPrime(num: Int): Boolean {
    var flag: Boolean = true
    for (i in 2 until num) {
        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}
fun getAllMaghsoomElaih(num: Int): String {
    var str= StringBuilder()
    str.append("{1")
    for (i in 2 until num) {
        if (num % i == 0) {
            str.append(",$i")
        }
    }
    str.append(",$num}")

    return str.toString()
}
