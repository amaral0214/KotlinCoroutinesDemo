package com.zjnh.kotlin

import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
    for (i in fibonacci) {
        println(i)
        if (i > 100) {
            break
        }
    }
}

//序列生成器
val fibonacci = buildSequence {
    yield(1)
    var cur = 1
    var next = 1

    while (true) {
        yield(next)
        val tmp = cur + next
        cur = next
        next = tmp
    }
}