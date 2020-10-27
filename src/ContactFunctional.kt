import java.lang.StringBuilder

val firstNameArray= arrayOfNulls<String>(10)
val lastNameArray= arrayOfNulls<String>(10)
val phoneNumberArray= arrayOfNulls<String>(10)
var counter=0

fun main() {
    printMenu()
}

fun printMenu() {
    print("""
        1.Add Contact
        2.Search Contact
        3.Edit Contact
        4.Show Contact
        5.Exit
        Enter a number for the action:
    """.trimIndent())
    when (readLine()) {
        "1" -> addToContact()
        "2" -> searchFromContact()
        "3" -> editTheContact()
        "4"-> showContact()
        "5"-> exit()
    }

}

fun showContact() {
    println(">>>>>>>>>>>Show Contact<<<<<<<<<<<<")
    val strBuilder:StringBuilder=StringBuilder()
    println("{ FirstName , LastName , PhoneNumber }")
    for (index in lastNameArray.indices) {
        strBuilder.append("{ ")
        strBuilder.append(firstNameArray[index])
        strBuilder.append(" , ")
        strBuilder.append(lastNameArray[index])
        strBuilder.append(" , ")
        strBuilder.append(phoneNumberArray[index])
        strBuilder.append(" }\n")
    }
    println(strBuilder)
    printMenu()
}

fun exit() {
    println(">>>>>>>>>>>Exit Contact<<<<<<<<<<<<")
    println("Are you sure you want to exit?(Yes/No)")
    when (readLine()) {
        "yes", "Yes", "YES", "y", "Y" -> println("Bye Bye")
        "No", "no", "N", "n" -> printMenu()
    }
}

fun editTheContact() {
    println(">>>>>>>>>>>Edit Contact<<<<<<<<<<<<")
    println("enter firstName or lastName to Edit the phone:")
    val searchCase= readLine()
    val foundIndex = findIndex(searchCase.toString())
    println("Enter new Number For ${firstNameArray[foundIndex]}\t${lastNameArray[foundIndex]}")
    val newNumber= readLine().toString()
    phoneNumberArray[foundIndex]=newNumber
    println("Successfully Edited...")
    printMenu()
}

fun searchFromContact() {
    println(">>>>>>>>>>>Search Contact<<<<<<<<<<<<")
    println("enter firstName or lastName to search for phone:")
    val searchCase= readLine()
    val foundIndex=findIndex(searchCase.toString())
    when (foundIndex) {
        -1 -> println("Nothing Found")
        else-> println("${firstNameArray[foundIndex]}\t${lastNameArray[foundIndex]}" +
                "\t\t${phoneNumberArray[foundIndex]}")
    }

    printMenu()
}
fun findIndex(strName: String): Int {
    var foundedIndex=-1
    for (index in firstNameArray.indices) {
            if (firstNameArray[index]?.contains(strName)!!
                    || lastNameArray[index]?.contains(strName)!!) {
                foundedIndex=index
                break
            }
        }
    return foundedIndex

    }


fun addToContact() {
    println(">>>>>>>>>>>Add to Contact<<<<<<<<<<<<")
    println("Enter FirstName:")
    val firsName= readLine()
    println("Enter LastName")
    val lastName= readLine()
    println("Enter PhoneNumber")
    val phoneNumber= readLine()
    firstNameArray[counter]=firsName
    lastNameArray[counter]=lastName
    phoneNumberArray[counter]=phoneNumber
    println("Successfully Added ${++counter} contact")
    println("Add other contact or back to Menu?(add/back)")
    when (readLine()) {
        "a","add","Add","A","ADD"->addToContact()
        "b","B","Back","BACK"->printMenu()
    }

}
