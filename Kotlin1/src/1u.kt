import java.io.File

fun main(){
    var countries=mutableListOf<String>()
    var capitals=mutableListOf<String>()
    var responses=mutableListOf<String>()
    var marks=mutableListOf<Int>()
    val f1=File("gk1.txt").readLines()

    for(i in 0 until 10){
        val parts=f1[i].trim().split(",")
        countries.add(parts[0])
        capitals.add(parts[1])
    }
    for (i in 0 until 10){
        println("What is the capital of ${countries[i]}?")
        val ans=readln()
        responses.add(ans)
    }
    println()
    println()
    for (i in 0 until 10){
        if(responses[i].trim().lowercase()==capitals[i].trim().lowercase()){
            marks.add(10)
        }else{
            marks.add(0)
        }
    }
    println()
    val total=marks.sum()
    println("Total Marks: $total")
    println("Wrongly Answered Questions:")
    for (i in 0 until 10){
        if(marks[i]==0){
            println("What is the capital of ${countries[i]}?")
            println("Correct answer: ${capitals[i]}")
            println()
        }
    }
}