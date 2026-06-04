fun main(){
    val list1=mutableListOf<String>()
    val list2=mutableListOf<Int>()
    val list3=mutableListOf<String>()
    list1.add("hey")
    list1.add("hi")
    list1.add("yeah")
    list1.add("yes")
    list1.add("nope")
    list1.add("thanks")
    list1.add("welcome")
    list1.add("bye")
    println("List: $list1")
    for( i in 0..7){
        val parts=list1[i].split(",")
        list2.add(i)
        list3.add(parts[i])
        println("Randomlly chosed to say: ${parts.random()}")
        if (i==list2[i]){
            val parts=list1[i].split(",").random()
        }else{
            println("$parts")
        }

    }
}
