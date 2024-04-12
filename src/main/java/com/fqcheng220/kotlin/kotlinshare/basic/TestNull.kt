package com.fqcheng220.kotlin.kotlinshare.basic

fun main() {
//    val test = TestJava.getNull().toString()
//    val test = TestKotlin.getNull().toString()
    testJavaInvoke7()
}

/**
 * 直接调用java返回可空的函数进行.链式调用，编译器不会提示需要加?.进行链式调用，运行时才报错，非常容易犯错，
这个时候只能通过给java返回可空的函数的方法加上注解@Nullable,编译器才能智能提示
 */
fun testJavaInvoke(){
    TestJava.getNull().doSth()
}


/**
 *调用java返回可空的函数，把返回值赋值给声明的不可空类型kotlin变量，编译器不会智能提示，运行时才报错，非常容易犯错
 */
fun testJavaInvoke1(){
    val testJava:TestJava = TestJava.getNull()
}


/**
 *调用java返回可空的函数，把返回值赋值给未显式声明类型的kotlin对象变量（默认转换为非空类型），用这个kotlin对象变量执行对象方法，编译器不会智能提示，运行时才报错，非常容易犯错
 */
fun testJavaInvoke2(){
    val testJava = TestJava.getNull()
    testJava.doSth()
}

fun testJavaInvoke3(){
    TestJava.testNullArgFuncInterface { str, testJava ->
        str.toString()
        testJava.toString()
    }
}

/**
 * 实现java单方法接口时候使用lambda表达式要注意：
 * 这里参数类型默认不带类型声明，都是非空类型，编译器不会智能提示，运行时才报错，非常容易犯错
 *
 * 解决方案：
 * 1.要么主动声明类型，如果不能确保java调用传参一定是非空，则需要主动声明可空类型
 * 2.不使用lambda表达式，使用object : java接口，ide中ctrl+i 自动带入重写接口方法定义（此时接口方法都是默认可空的）
 */
fun testJavaInvoke4(){
    TestJava.testNullArgFuncInterface { str, testJava ->
        testJava.doSth()
    }
}

fun testJavaInvoke5(){
    TestJava.testNullArgFuncInterface { str, testJava ->
        print(str)
    }
}

fun testJavaInvoke6(){
    TestJava.testNullArgFuncInterface { str, testJava ->
        print("123")
    }
}

fun testJavaInvoke7(){
//    val str0:String? = "123"
//    val str1:String = str0
}

fun testJavaInvoke8(){
    TestJava.testNullArgFuncInterface(object :TestJava.NullArgFuncInterface{
        override fun testMultiNullArgFunc(str: String?, testJava: TestJava?) {
            testJava?.doSth()
        }
    })
}

fun testJavaInvoke9(){
    TestJava.testNullArgFuncInterface2(object : TestJava.NullArgFuncInterface2 {
        override fun testNullArgFunc(str: String?) {
            str.toString()
        }

        override fun testMultiNullArgFunc(str: String?, testJava: TestJava?) {
            testJava?.doSth()
        }
    })
}


/**
 *如果打开注释代码，编译期就报错，可以规避运行时的空指针
 */
fun testKotlinInvoke(){
//    TestKotlin.getNull().doSth()
}