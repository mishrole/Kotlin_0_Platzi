fun set() {
    // Sets : Can't have duplicate elements (delete duplicate)
    // Immutable
    val duplicateVocals = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println(duplicateVocals)

    val favoriteNumbers = mutableSetOf(1,2,3,4)
    println(favoriteNumbers)

    // Add elements
    favoriteNumbers.add(5)
    favoriteNumbers.add(5)
    println(favoriteNumbers)

    // Remove elements
    favoriteNumbers.remove(5)
    println(favoriteNumbers)

    val firstValue : Int? = favoriteNumbers.firstOrNull { number -> number > 2 }
    println(firstValue)
}