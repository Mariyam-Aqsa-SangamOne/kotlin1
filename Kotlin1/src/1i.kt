import kotlin.math.pow

fun calc3(n1:Int, n2:Int){
    val sum1=n1+n2
    val dif1=n1-n2
    val prd1=n1*n2
    val div1=n1.toDouble()/n2
    val div2=n1/n2
    val rem1=n1%n2
    val exp1=n1.toDouble().pow(n2.toDouble())

    println("$sum1 $dif1 $prd1 $div1 $div2 $rem1 $exp1")
}
fun main(){
    val result=(calc3(10,2))
    println(result)
}