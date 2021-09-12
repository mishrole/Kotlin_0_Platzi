fun elvisOperator () {
    // Elvis operator -> Return a value when an element is null

    var name : String? = null
    //var nameLength : Int = name?.length // mismatch Int = Int?
    var nameLength : Int = name?.length ?: 0 // takes right if left is null
    println(nameLength) // print 0
}