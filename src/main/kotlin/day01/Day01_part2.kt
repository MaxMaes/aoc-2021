package day01

import readInput

fun main() {
    val input = readInput("day_01")
    val numbers = input.map { it.toInt() }
    val windowSize = 3

    val answer = (1.. numbers.size - windowSize).count { index ->
        val depth = numbers.subList(index, index + windowSize).sum()
        val prevDepth = numbers.subList(index - 1, index - 1 + windowSize).sum()
        prevDepth < depth
    }

    println(answer)
}