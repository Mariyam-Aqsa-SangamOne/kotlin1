fun display(usn:String,name:String,age:Int){
    println("Student Details\nUsn:$usn\nName:$name\nAge:$age")
}
fun main(){
    println("Enter your Usn:")
    val usn=readLine()!!
    println("Enter your Name:")
    val name=readLine()!!
    println("Enter your Age :")
    val age=readLine()!!.toInt()
    display(usn,name,age)
}
