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
       Kotlin se basa en el tipo de dato asignado */

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
}