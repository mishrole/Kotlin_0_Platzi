fun list2() {
    // List functions
    val lottery = listOf(11,22,55,66,33,44)

    val sortedAsc = lottery.sorted() // ascendant
    println(sortedAsc)

    val sortedDesc = lottery.sortedDescending() // descendant
    println(sortedDesc)

    val sortedBy = lottery.sortedBy { number -> number < 50 } // > 50 go first
    println(sortedBy)

    val random = lottery.shuffled()
    println(random)

    val reversed = lottery.reversed()
    println(reversed)

    // Lists in functional programming

    val lotteryMessages = lottery.map { number ->
        //println(number)
        "Your lottery number is $number" // Lambda always return last element
    }
    println(lotteryMessages)

    val filtered = lottery.filter { number -> number > 50 }
    println(filtered)

    val filterMap = lottery.filter { number ->
        number > 50
    }.map { number ->
        "Number is $number"
    }
    println(filterMap)
}