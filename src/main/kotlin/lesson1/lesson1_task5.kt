package org.example.lesson1

fun main() {
    val secondsInSpace = 6480

    val minutesInSpace = secondsInSpace / 60
    val currentSeconds = secondsInSpace % 60

    val hoursInSpace = minutesInSpace / 60
    val currentMinutes = minutesInSpace % 60

    val h = String.format("%02d", hoursInSpace)
    val m = String.format("%02d", currentMinutes)
    val s = String.format("%02d", currentSeconds)

    println("$h:$m:$s")
}