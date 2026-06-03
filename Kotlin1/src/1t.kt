fun diamond1(word: String) {

    for (i in 1..word.length) {
        println(word.substring(0, i))
    }

    for (i in word.length - 1 downTo 1) {
        println(word.substring(0, i))
    }
}

fun diamond2(word: String) {

    val n = word.length

    for (i in 1..n) {
        val spaces = " ".repeat(n - i)
        println(spaces + word.substring(0, i))
    }

    for (i in n - 1 downTo 1) {
        val spaces = " ".repeat(n - i)
        println(spaces + word.substring(0, i))
    }
}

fun diamond3(word: String) {

    val n = word.length

    for (i in 1..n) {
        val spaces = " ".repeat(n - i)
        val letters = word.substring(0, i).toCharArray().joinToString(" ")
        println(spaces + letters)
    }

    for (i in n - 1 downTo 1) {
        val spaces = " ".repeat(n - i)
        val letters = word.substring(0, i).toCharArray().joinToString(" ")
        println(spaces + letters)
    }
}

fun main() {

    val word = "Funwith"

    println("Right Diamond:")
    diamond1(word)

    println()

    println("Left Diamond :")
    diamond2(word)

    println()

    println("Full Diamond :")
    diamond3(word)
}