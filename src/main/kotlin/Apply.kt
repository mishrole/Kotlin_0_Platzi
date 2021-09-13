fun apply() {
    // Apply
    // Executes without this in lambda (versus With)
    // Accept null
    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
    mobiles.apply {
        removeIf { mobile -> mobile.contains("Google")}
    }

    println(mobiles)    // Print [Huawei Redmi 9, Xiaomi mi a3]

    val colors : MutableList<String>? = mutableListOf("Blue", "Red", "Yellow")

    /*
    * (SECURE) Using libraries
    * Is it null?         IDK           NUllPointerException
    * */

    colors?.apply {
        // Secure           value is not null
        println("Our colors are $this")
        println("Colors count is $size")
    }

    /*
    * Print
    *   Our colors are [Blue, Red, Yellow]
        Colors count is 3
    * */

}