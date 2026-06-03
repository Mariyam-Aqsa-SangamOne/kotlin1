import java.io.File
fun main(){
    val line=File("in2.txt").readText().trim()
    val numbers=line.split(",")
    val start=numbers[0].toInt()
    val end=numbers[1].toInt()
    var output=""
    for(j in start..end){
        for(i in 1..10){
            output+="$j*$i=${j*i}\n"
        }
        output+="\n"
    }
    print(output)
    File("out1.txt").writeText(output)
}