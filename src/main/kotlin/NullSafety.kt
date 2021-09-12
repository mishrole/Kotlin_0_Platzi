fun nullSafety() {
        /* Null-Safety
        Null : Our variable is pointing to a non-existent memory reference
        0 vs null -> 0 exists but don't have more | null doesn't exist

        A Boolean can have three values: true | false | null because of Java and null pointer.
        Null Pointer was created by Sir Tony Hoare in 1965.
        In 2009 Hoare said it was a millionaire mistake, was an easy solution but is a bad practice
        */

        // Null is not bad, but it's necessary to use it with caution
        var middleName : String? = "Mitchell"

        // Safe Calls : A nullable variable isn't null
        println(middleName?.length)

        // Double bang : Will never be null (caution: Murphy's Law, it's a bad practice)
        println(middleName!!.length)

        // Interoperability with Java -> type Integer! is a warning
        // Calling a function from Java, Integer! means it can't be verified by Kotlin
        // Try to use nullable on Integer! (Murphy's Law)
}