fun with() {
    // With
    // Directly (Access)
    val colors = listOf("Blue", "Yellow", "Red")
    with(colors) {
        println("Our colors are $this")
        println("Our list have $size colors")
    }
}