fun map () {
    // Maps     Key : Value
    // Immutable
    val superheroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Captain America" to 99
    )
    println(superheroes)

    // Mutable
    val villains = mutableMapOf(
        "X" to 999,
        "Y" to 998,
        "Z" to 997
    )
    println(villains)

    // Add key:value
    villains.put("A", 1001)
    println(villains)

    villains["B"] = 1002
    println(villains)

    // Get value
    val ironmanAge = superheroes["Ironman"]
    println(ironmanAge)

    // Remove
    villains.remove("B")
    println(villains)

    // Get ALL keys
    println(villains.keys)

    // Get ALL values
    println(villains.values)
}