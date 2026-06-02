fun main(){
    println("Enter first number:")
    val n1=readLine()!!.toInt()
    println("Enter second number:")
    val n2=readLine()!!.toInt()
    for(j in n1..n2) {
        for (i in 1..10) {
            println("$j*$i=${j * i}")
        }
        println()
    }
}