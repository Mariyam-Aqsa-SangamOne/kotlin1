import java.io.File
fun main(){
    val line=File("in2.txt").readText().trim()
    val numbers=line.split(",")
    val start=numbers[0].toInt()
    val end=numbers[1].toInt()
    for(j in start..end){
        var output=""
        for(i in 1..10){
            output+="$j*$i=${j*i}\n"
        }
        File("$j.txt").writeText(output)
        println("Created $j.txt")
    }
}