package com.fqcheng220.kotlin.kotlinshare.utils

class Logger {
    companion object{
        fun d(tag:String?,msg:String?){
            System.out.println("[$tag]:$msg")
        }
    }
}