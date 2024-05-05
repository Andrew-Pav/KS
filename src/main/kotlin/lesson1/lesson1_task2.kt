package org.example.lesson1

fun main() {

    var numberOfOrders: Byte = 75 //var потому что количество заказов должно меняться
    val thankYouText: String = "Благодарим за покупку"
    println("$numberOfOrders\n$thankYouText")

    var amountOfWorkers: Short = 2000
    //println(amountOfWorkers)

    var resignedWorkers: Short = 1

    amountOfWorkers = (amountOfWorkers - resignedWorkers).toShort()
    println(amountOfWorkers)

}