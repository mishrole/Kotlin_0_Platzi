fun listsManipulation() {
    // For Loop
    // listOf can't be changed
    val fruits = listOf("Apple", "Strawberry", "Banana")
    for (fruit in fruits) //{
        println("Today I'm gonna eat a fruit called $fruit")
    //}

    // For Each Loop
    fruits.forEach {
        // Using lambda
            fruit -> println("I wanna eat a new fruit called $fruit")
    }

    // Map : Transform List
    val fruitChars : List<Int> = fruits.map {
            fruit -> fruit.length
    }
    println(fruitChars)

    // Filter : Filter List
    val filteredFruits = fruitChars.filter { fruit -> fruit > 5 }
    println(filteredFruits)
}