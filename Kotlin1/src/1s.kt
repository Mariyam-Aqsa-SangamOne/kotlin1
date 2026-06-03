import java.time.LocalDateTime
import java.time.ZoneOffset

fun main() {

    val cities = listOf(
        "San Francisco",
        "New York",
        "London",
        "Dubai",
        "Bangalore",
        "Singapore",
        "Tokyo",
        "Sydney",
        "Wellington"
    )

    val offsets = listOf(
        -7.0,
        -4.0,
        1.0,
        4.0,
        5.5,
        8.0,
        9.0,
        10.0,
        12.0
    )

    val utcTime = LocalDateTime.now(ZoneOffset.UTC)

    for (i in cities.indices) {

        val hours = offsets[i].toInt()
        val minutes = ((offsets[i] - hours) * 60).toInt()

        val localTime = utcTime
            .plusHours(hours.toLong())
            .plusMinutes(minutes.toLong())

        println("${cities[i]} : ${localTime.toLocalTime()}")
    }
}