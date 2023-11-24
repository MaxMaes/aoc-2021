package day01

import readInput

fun main() {
    val input = readInput("day_01")
    val numbers = input.map { it.toInt() }
    var amountOfTimesLarger = 0
    numbers.forEachIndexed { index, number ->
        if(index == 0) 0
        else if(numbers[index - 1] < number) amountOfTimesLarger += 1
    }
    println(amountOfTimesLarger)
}