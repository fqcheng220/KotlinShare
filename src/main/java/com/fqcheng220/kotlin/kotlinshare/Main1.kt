package com.fqcheng220.kotlin.kotlinshare

import com.fqcheng220.kotlin.kotlinshare.coroutine.CoroutineDemo

/**
 * intellij idea无法识别main方法，main方法不能包裹在任何类里
 */
class Main1 {
    companion object{
        fun main(args:Array<String?>?){
            CoroutineDemo.test()
        }
    }
}