fun tryCatch() {
    // Exceptions
    // Use try/catch only when you need
    var name : String? = null
    //name!!.length // NullPointerException
    //println(name?.length) // Print null

    try {
        //name!!.length
        throw NullPointerException("Something went wrong")
    } catch (ex : NullPointerException) {
        println("Oops! There's a Null Pointer Exception")
    } finally {
        println("Closing app...")
    }

    val firstValue = 10
    val secondValue = 0
    val result : Int = try {
        firstValue / secondValue
    } catch (exception : Exception) {
        0
    }

    println(result)
}