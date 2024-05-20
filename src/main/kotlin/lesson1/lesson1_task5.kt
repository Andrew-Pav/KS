package org.example.lesson1

const val SEXAGESIMAL_SYSTEM = 60
fun main() {
    val secondsInSpace = 6480

    val minutesInSpace = secondsInSpace / SEXAGESIMAL_SYSTEM
    val currentSeconds = secondsInSpace % SEXAGESIMAL_SYSTEM

    val hoursInSpace = minutesInSpace / SEXAGESIMAL_SYSTEM
    val currentMinutes = minutesInSpace % SEXAGESIMAL_SYSTEM

    val h = String.format("%02d", hoursInSpace)
    val m = String.format("%02d", currentMinutes)
    val s = String.format("%02d", currentSeconds)

    println("$h:$m:$s")
}