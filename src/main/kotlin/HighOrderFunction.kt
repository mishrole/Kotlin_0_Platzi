fun highOrderFunction() {
    // High Order Function
    // Open box (lambda)
    val initialValueLength = superFunction(initialValue = "Hi", block = {
            value -> value.length
    })
    println(initialValueLength)

    // HARDCORE MODE        ON
    val lambda : () -> String = inceptionFunction("Mitchell")
    val lambdaValue : String = lambda()
    println(lambdaValue)
}

/*
* Block: Lambdas
* Event, Listener : Unit
*
* Closed box (lambda)
* Two params:
* 1. initialValue is String
* 2. block is the Int return of a function
*   this function needs a param String and returns Int
*/

fun superFunction(initialValue : String, block : (String) -> Int) : Int {
    return block(initialValue)
}

fun inceptionFunction(name : String) : () -> String {
    return {
        "Hi $name"
    }
}
