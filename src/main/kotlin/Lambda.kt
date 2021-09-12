fun lambda() {
    // Lambdas        anonymous
    // A closed box (lambda) until is open (value)
    // Lambda is a non-executed code, run it to get value
    // it's our param String
    val myLambda : (String) -> Int = {
            value -> value.length
    }
    // Because our box isn't open
    // println(myLambda)  // Print Function1<java.lang.String, java.lang.Integer>

    // Open the box (run lambda)
    val executedLambda : Int = myLambda("Hi lambda")
    println(executedLambda) // Print 9

    val greetings = listOf("Hello", "Hola", "Ciao")
    val greetingsLenght = greetings.map(myLambda) // Connection between map and myLambda
    println(greetingsLenght) // Print [5, 4, 4]

    /*
    * // Same but            value -> value.length (2)
    *
    *
    * val greetingsLength = greetings.map {
    *   value -> value.length
    * }
    *
    * */

}
