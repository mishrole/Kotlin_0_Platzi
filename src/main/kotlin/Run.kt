fun run() {
    // Run
    // Executes after variable declaration

    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .run {
            removeIf {
                    mobile -> mobile.contains("Google")
            }
            this
        }
    println(mobiles) // Print [Huawei Redmi 9, Xiaomi mi a3]
}