package org.example.lesson1

fun main() {
    val secondsInSpace = 6480

    val minutesInSpace = secondsInSpace / 60
    val currentSeconds = secondsInSpace % 60

    val hoursInSpace = minutesInSpace / 60
    val currentMinutes = minutesInSpace % 60

    val list: Array<Int> = arrayOf(hoursInSpace, currentMinutes, currentSeconds)

    var h = "$hoursInSpace"
    var m = "$currentMinutes"
    var s = "$currentSeconds"

    list.forEach {
        if (it < 10 && it == hoursInSpace) {
            h = "0$hoursInSpace"
        } else if (it < 10 && it == currentMinutes) {
            m = "0$currentMinutes"
        } else if (it < 10 && it == currentSeconds) {
            s = "0$currentSeconds"
        }
    }

    println("$h:$m:$s")
}