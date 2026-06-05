import java.io.File

fun quiz2(fname: String) {
    var name = mutableListOf<String>()
    var sports = mutableListOf<String>()
    var responses = mutableListOf<String>()
    var marks = mutableListOf<Int>()
    val f1 = File(fname).readLines()

    for (i in 0 until 10) {
        val parts = f1[i].trim().split("$$")
        name.add(parts[0])
        sports.add(parts[1])
    }

    val indices = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    indices.shuffle()

    for (i in 0 until 10) {
        val index = indices[i]
        println("${name[index]} is associated to which sport?")
        val ans = readln()
        responses.add(ans)

        if (ans.trim().lowercase() == sports[index].trim().lowercase()) {
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
                println("${name[index]} is associated to which sport?")
                println("Correct answer: ${sports[index]}")
                println()
            }
        }
    }
}
fun main(){
    quiz2("gk2.txt")
}
