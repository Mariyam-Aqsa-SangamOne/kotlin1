import kotlin.math.pow

fun calc2(n1: Int, n2: Int): MutableList<Double>{
    val sum1 = (n1 + n2).toDouble()
    val dif1 = (n1 - n2).toDouble()
    val prd1=(n1*n2).toDouble()
    val div1=n1.toDouble()/n2
    val div2=(n1/n2).toDouble()
    val rem1=(n1%n2).toDouble()
    val exp1=n1.toDouble().pow(n2.toDouble())
    val list1 = mutableListOf<Double>()
    list1.add(sum1)
    list1.add(dif1)
    list1.add(prd1)
    list1.add(div1)
    list1.add(div2)
    list1.add(div2)
    list1.add(rem1)
    list1.add(exp1)
    return list1
}
fun main(){
    print("Enter first integer: ")
    val n1=readLine()!!.toInt()
    print("Enter second integer: ")
    val n2=readLine()!!.toInt()
    val list1=calc2(n1,n2)
    println(list1)
}