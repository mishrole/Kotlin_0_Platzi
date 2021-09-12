fun main(args: Array<String>) {
    val name = "Mitchell"

    if (name.isNotEmpty()) {
        println("Name length is ${name.length}")
    } else {
        println("Error, empty variable")
    }

    val colorName = "Crimson"

    when (colorName) {
        // Inline
        "Yellow" -> println("$colorName is a happy color")
        // Multiple lines
        // Many conditions, same result
        "Red", "Crimson" -> {
            println("$colorName is the color of love")
        }

        else -> println("Error, I don't have information for $colorName color")
    }

    val code = 200

    when (code) {
        in 200..299 -> println("Yay!")
        in 400..500 -> println("Something went wrong")
        else -> println("Code $code unknown")
    }

    val shoesSize = 45
    val message = when(shoesSize) {
        41,43 -> "Available"
        42, 44 -> "2 in stock"
        45 -> "Sold out"
        else -> "Oops, max size is 45"
    }

    println(message)
}