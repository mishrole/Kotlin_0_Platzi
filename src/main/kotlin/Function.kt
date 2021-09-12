fun function() {
    val phrase = "Hôj Hôk Hòh"
    printPhrase(randomCase(phrase))

    // Using extended functions
    "Mitch".sayHi()
    val code = "Mitchell".generateCode()
    printCode(code)

    // Named params
    printFullname(firstname = "Mitchell", lastname = "Rodríguez")
}

// Function (Return)
fun plus(firstValue: Int, secondValue: Int) : Int {
    return firstValue + secondValue
}

fun randomCase(phrase: String) : String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()

    return if (randomResult.rem(2) == 0) {
        phrase.uppercase()
    } else {
        phrase.lowercase()
    }

}

// Function without return (Unit Kotlin -> Void Java)
fun printName(firstname: String, lastname: String) {
    print("My name is $firstname and my lastname is $lastname")
}

fun printPhrase(phrase : String) : Unit {
    println("Your phrase is: $phrase")
}

fun printCode(code : String) : Unit {
    println("Your code is: $code")
}

// Extended Functions
fun String.sayHi() {
    println("Hi $this")
}

fun String.generateCode() : String {
    val randomNumber = 0..25
    val randomResult = randomNumber.random()

    return "$this-$randomResult"
}

// Default param
fun printFullname(firstname: String, middlename: String =  "", lastname: String) {
    print("My fullname is $firstname $middlename $lastname")
}

