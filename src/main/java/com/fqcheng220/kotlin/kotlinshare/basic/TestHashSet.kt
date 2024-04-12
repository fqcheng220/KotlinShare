package com.fqcheng220.kotlin.kotlinshare.basic

import com.fqcheng220.kotlin.kotlinshare.utils.Logger
import java.util.*

val TAG: String = "TestHashSet"

fun main() {
//    val test = TestJava.getNull().toString()
//    val test = TestKotlin.getNull().toString()
    testHashSetTraversal()
}

private fun testHashSetTraversal() {
    Logger.d(TAG, "testHashSetTraversal")
    for (k in 0..99) {
        val hashSet: HashSet<Int> = hashSetOf()
        for (j in 0..399) {
            hashSet.add(j)
        }
        var i = 0
        val iterator: MutableIterator<Int> = hashSet.iterator()
        while (iterator.hasNext()) {
            val cur = iterator.next()
            if (cur != i) {
                Logger.d(TAG, "$k filter $i $cur")
            } else {
//                Logger.d(TAG, "$k match $i $cur")
            }
            i++
        }
    }
}
