package me.chiquita.kotlin

import kotlin.random.Random

fun main(args: Array<String>) {
    var heads = 0
    var tails = 0
    var count: Int = 10

    if (args.isNotEmpty()) {
        count = args[0].toInt()
    }

    val flip = { Random.nextFloat() < 0.5 }

    val start = System.currentTimeMillis()
    for (i in 1..count) {
        if (flip()) {
            heads++
        } else {
            tails++
        }
    }
    val end = System.currentTimeMillis()

    // Print results
    println("elapsed: ${end-start}ms")
    println("heads: $heads")
    println("tails: $tails")
    println("flips: $count")

    // Calculate ratio
    println("heads ratio: ${heads.toFloat()/count}")
    println("tails ratio: ${tails.toFloat()/count}")
}