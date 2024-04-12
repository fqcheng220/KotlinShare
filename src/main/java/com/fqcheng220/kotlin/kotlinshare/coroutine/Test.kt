package com.fqcheng220.kotlin.kotlinshare.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Test {
    fun viewByteCode(){
        GlobalScope.launch {
            delay(10)
        }
    }
}