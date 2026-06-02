import java.io.File
fun main(){
    val line=File("in2.txt").readText().trim()
    val numbers=line.split(",")
    val start=numbers[0].toInt()
    val end=numbers[1].toInt()
    for(num in start..end){
        for(i in 1..10){
            println("$num*$i=${num*i}")
        }
        println()
    }
}