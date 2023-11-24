package day02

import readInput

fun main() {
    val input = readInput("day_02")
    var (horizontal, depth) = 0 to 0

    input.map { line ->
        if(line.startsWith("f")) horizontal += line.last().digitToInt()
        else if(line.startsWith("u")) depth -= line.last().digitToInt()
        else if(line.startsWith("d")) depth += line.last().digitToInt()
    }

    val answer = horizontal * depth
    println(answer)
}