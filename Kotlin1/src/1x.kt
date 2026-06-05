import java.io.File

fun quiz1(fname: String) {
    var countries = mutableListOf<String>()
    var capitals = mutableListOf<String>()
    var responses = mutableListOf<String>()
    var marks = mutableListOf<Int>()
    val f1 = File("gk1.txt").readLines()

    for (i in 0 until 10) {
        val parts = f1[i].trim().split(",")
        countries.add(parts[0])
        capitals.add(parts[1])
    }

    val indices = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    indices.shuffle()

    for (i in 0 until 10) {
        val index = indices[i]
        println("What is the capital of ${countries[index]}?")
        val ans = readln()
        responses.add(ans)

        if (ans.trim().lowercase() == capitals[index].trim().lowercase()) {
            marks.add(10)
        } else {
            marks.add(0)
        }
    }
    println()
    val total = marks.sum()
    println("Total Marks: $total")
    if (total == 100) {
        println("Congratulations!!")
    }else {
        println("Wrongly Answered Questions:")
        for (i in 0 until 10) {
            if (marks[i] == 0) {
                val index = indices[i]
                println("What is the capital of ${countries[index]}?")
                println("Correct answer: ${capitals[index]}")
                println()
            }
        }
    }
}
fun main(){
    quiz1("gk1.txt")
}
