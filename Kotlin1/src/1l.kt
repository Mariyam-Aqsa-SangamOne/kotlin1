import java.io.File
fun main(){
    val lines=File("in1.txt").readLines()
    val start=lines[0].toInt()
    val end=lines[1].toInt()
    for(num in start..end){
        for(i in 1..10){
            println("$num*$i=${num*i}")
        }
        println()
    }
}