/*
Variables de Sólo Lectura para Constantes
- Declaradas en tiempo de Compilación
- Se generan antes del RUN
- Sabemos que NO va a cambiar
*/
const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")

    /* Podemos omitir el tipo explícito
       Kotlin se basa en el tipo de dato asignado

       El uso depende de las convenciones del equipo
    */

    // Variables de Lectura y Escritura
    var money : Int = 10
    println(money)
    money = 5
    println(money)

    /* Variables de Sólo Lectura
       - Declarada en tiempo de Ejecución
    */
    val nombre = "Mitchell"
    println(nombre)
    println(PI)

    // Tipos de Datos
    // Boolean
    val boolean : Boolean = true
    // Long (Soporta una gran cantidad de números)
    val longNumber : Long = 3L
    // Dobles
    val doubleNumber : Double = 2.7182
    // Flotantes
    val floatNumber : Float = 1.1f

    // En Kotlin todo es un objeto

    val firstValue = 20
    val secondValue = 10
    //    val thirdValue = firstValue.minus(secondValue)
    val thirdValue = firstValue - secondValue
    // Minus <- ctrl + B
    println(thirdValue)

    /* En tiempo de ejecución Kotlin lo compila como un primitivo
    siempre y cuando no sea nullable */

    // Cadenas de Texto
    val lastname = "Venn"
    val name = "Klaus"
    val fullname = "$name $lastname" // Template (Interpolación)
    println(fullname)
}