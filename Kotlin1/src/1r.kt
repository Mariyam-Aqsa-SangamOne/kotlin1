import java.io.File

fun main() {

    val names = mutableListOf<String>()

    val sub1 = mutableListOf<Int>()
    val sub2 = mutableListOf<Int>()
    val sub3 = mutableListOf<Int>()
    val sub4 = mutableListOf<Int>()
    val sub5 = mutableListOf<Int>()

    val subjects = mutableListOf<String>()

    val toppersSub1 = mutableListOf<String>()
    val toppersSub2 = mutableListOf<String>()
    val toppersSub3 = mutableListOf<String>()
    val toppersSub4 = mutableListOf<String>()
    val toppersSub5 = mutableListOf<String>()

    val totals = mutableListOf<Int>()
    val topper = mutableListOf<String>()

    val lines = File("marks.txt").readLines()

    for (i in 0 until 26) {

        val list1 = lines[i].split(",")

        names.add(list1[0])

        val list2 = list1[3].split(":")
        sub1.add(list2[1].toInt())
        if (i == 0) subjects.add(list2[0])

        val list3 = list1[4].split(":")
        sub2.add(list3[1].toInt())
        if (i == 0) subjects.add(list3[0])

        val list4 = list1[5].split(":")
        sub3.add(list4[1].toInt())
        if (i == 0) subjects.add(list4[0])

        val list5 = list1[6].split(":")
        sub4.add(list5[1].toInt())
        if (i == 0) subjects.add(list5[0])

        val list6 = list1[7].split(":")
        sub5.add(list6[1].toInt())
        if (i == 0) subjects.add(list6[0])

        val total = sub1[i] + sub2[i] + sub3[i] + sub4[i] + sub5[i]
        totals.add(total)
    }

    val maxSub1 = sub1.max()
    val maxSub2 = sub2.max()
    val maxSub3 = sub3.max()
    val maxSub4 = sub4.max()
    val maxSub5 = sub5.max()
    val maxTotal = totals.max()

    for (i in 0 until 26) {

        if (sub1[i] == maxSub1) {
            toppersSub1.add(names[i])
        }

        if (sub2[i] == maxSub2) {
            toppersSub2.add(names[i])
        }

        if (sub3[i] == maxSub3) {
            toppersSub3.add(names[i])
        }

        if (sub4[i] == maxSub4) {
            toppersSub4.add(names[i])
        }

        if (sub5[i] == maxSub5) {
            toppersSub5.add(names[i])
        }

        if (totals[i] == maxTotal) {
            topper.add(names[i])
        }
    }

    println("Toppers in ${subjects[0]} are: ${toppersSub1[0]} and ${toppersSub1[1]} with marks $maxSub1")
    println("Toppers in ${subjects[1]} are: ${toppersSub2[0]} and ${toppersSub2[1]} with marks $maxSub2")
    println("Toppers in ${subjects[2]} are: ${toppersSub3[0]} and ${toppersSub3[1]} with marks $maxSub3")
    println("Toppers in ${subjects[3]} are: ${toppersSub4[0]}  with marks $maxSub4")
    println("Toppers in ${subjects[4]} are: ${toppersSub5[0]} and ${toppersSub5[1]} with marks $maxSub5")
    println("Overall topper is: ${topper[0]} with total marks $maxTotal")
}