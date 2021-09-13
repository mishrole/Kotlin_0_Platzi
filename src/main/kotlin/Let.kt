fun let() {

    //val name : String? = null
    var name : String? = null
    // Let + Safe Calls
    /*
     *
     * //Non-executed       name == null
     * name?.let {
     * value -> println("Name is not null, is $value")
     * }
     *
    */

    // Execute only         name != null
    name = "Mitchell"
    name?.let {
            value -> println("Name is not null, is $value")
    }

}