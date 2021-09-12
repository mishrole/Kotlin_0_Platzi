fun list () {
    // Collections : List

    // Immutable
    val immutableNames = listOf("Klaus", "Neon")
    println(immutableNames)
    // names.remove // Can't remove elements

    // Mutable
    val mutableNames = mutableListOf<String>()
    println(mutableNames) // []

    // Add element to immutable list
    mutableNames.add("Nina")
    println(mutableNames) // [Nina]

    // Get list value
    val getName = mutableNames.get(0)
    println(getName)

    val getNameWithOperator = mutableNames[0]
    println(getNameWithOperator)

    // Get first value from immutable list
    val firstValue = immutableNames.firstOrNull()
    println(firstValue)

    // Remove element from mutable list
    mutableNames.removeAt(0)
    println(mutableNames)

    mutableNames.add("Node")
    mutableNames.add("Grape")

    // Conditional remove
    mutableNames.removeIf { chars -> chars.length > 4}
    println(mutableNames)

    // Lists vs Arrays
    val myArray = arrayOf(1,2,3,4)
    println("Our array $myArray") // Our array [Ljava.lang.Integer;@a0dae53d 🤯
    println("Array to list ${myArray.toList()}")
    // In Kotlin is preferable to use Lists, use Arrays with large data (for better performance)
}