package day02

import readInput

fun main() {
    val input = readInput("day_02")
    var horizontal = 0
    var depth = 0
    var aim = 0

    input.map { line ->
        if(line.startsWith("f")) {
            horizontal += line.last().digitToInt()
            depth += (aim * line.last().digitToInt())
        }
        else if(line.startsWith("u")) aim -= line.last().digitToInt()
        else if(line.startsWith("d")) aim += line.last().digitToInt()
    }

    val answer = horizontal * depth
    println(answer)
}