fun also() {
    /*
    * Also
    *
    * Get variable -> Execute code with that variable -> return as param (chain functions)
    * */
    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
    mobiles.also { list ->
        println("Original value is $list")
    }.asReversed()

    println(mobiles)

    /*
    * PRINT
    *
    * Original value is [Google Pixel 2XL, Google Pixel 4a, Huawei Redmi 9, Xiaomi mi a3]
    * [Google Pixel 2XL, Google Pixel 4a, Huawei Redmi 9, Xiaomi mi a3]
    *
    * */
}