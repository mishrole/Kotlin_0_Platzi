/*
* Bug windows with intellij terminal
*   enter
* */

//Declarando valores de las respuestas
const val AFFIRMATIVE_ANSWER = "✅"
const val NEGATIVE_ANSWER = "❌"
const val DOUBTFUL_ANSWER = "?"

//uniendo las respuestas con sus valores
val answers = mapOf(
    "Yes" to AFFIRMATIVE_ANSWER,
    "It's true" to AFFIRMATIVE_ANSWER,
    "Totally" to AFFIRMATIVE_ANSWER,
    "Undoubtedly" to AFFIRMATIVE_ANSWER,
    "Ask in an other moment" to DOUBTFUL_ANSWER,
    "I can't say you in this moment" to DOUBTFUL_ANSWER,
    "Maybe yes, or maybe not" to DOUBTFUL_ANSWER,
    "It's not going to happen" to NEGATIVE_ANSWER,
    "Do not count on it" to NEGATIVE_ANSWER,
    "Definitely not" to NEGATIVE_ANSWER,
    "I don't believe it" to NEGATIVE_ANSWER
)

fun main(args: Array<String>) {
    println("Hi! Select an option")
    println("1. Ask a question")
    println("2. All answers")
    println("3. Exit")

    val input = readLine()

    // When         String nullable
    when(input) {
        "1" -> ask()
        "2" -> show()
        "3" -> exit()
        else -> showError()
    }
}

fun showError() {
    println("Oops! Option invalid")
}

fun exit() {
    println("Bye!")
}

// Red function?      alt + enter

fun show() {
    println("Select an option")
    println("1. Show all answer")
    println("2. Get affirmative")
    println("3. Get uncertain")
    println("3. Get Negative")

    val optionShow = readLine()
    when(optionShow) {
        "1" -> showByType()
        "2" -> showByType(type = AFFIRMATIVE_ANSWER)
        "3" -> showByType(type = NEGATIVE_ANSWER)
        "4" -> showByType(type = DOUBTFUL_ANSWER)
        else -> println("Oops! Closing...")
    }
}

fun showByType(type : String = "ALL") {
    when(type) {
        // Foreach doesn't return
        "ALL" -> answers.keys.forEach { answer ->
            println(answer)
        }

        // Filter
        // TODO: .also        fix
        AFFIRMATIVE_ANSWER -> answers.filterValues {
            values ->
                values == AFFIRMATIVE_ANSWER
        }.also { affirmativeAnswer ->
            println(affirmativeAnswer.keys)
        }

        NEGATIVE_ANSWER -> answers.filterValues {
                values -> values == NEGATIVE_ANSWER
        }.also { negativeAnswer -> println(negativeAnswer.keys) }

        DOUBTFUL_ANSWER -> answers.filterValues {
                values -> values == DOUBTFUL_ANSWER
        }.also { doubtfulAnswer -> println(doubtfulAnswer.keys) }

    }
}

fun ask() {
    println("Ask your question")
    readLine()
    println("answer is...")
    val answer = answers.keys.random()
    println(answer)
}
