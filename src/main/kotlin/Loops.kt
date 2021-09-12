fun loops() {
    // While : Verifies condition then execute
    // Print 10 to 1 and stop
    var counter = 10
    while (counter > 0) {
        println("Counter value is $counter")
        counter--
    }

    // Do While : Executes then verify condition
    // Print random numbers including first < 50 number and stop
    do {
        println("Generating random number...")
        val randomNumber = (0..100).random()
        println("Generated number is $randomNumber")
    } while (randomNumber > 50)
}