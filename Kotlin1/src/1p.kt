fun main(){
    for(j in 0..11){
        for(i in 0..11){
            val time1="${9+j}:${(i*5).toString().padStart(2,'0')}"
            val angle1=(90-j*30)+i*30-i*2.5
            val angle2=((angle1%360)+360)%360
            println("$time1-$angle2")
        }
        println()
    }
}