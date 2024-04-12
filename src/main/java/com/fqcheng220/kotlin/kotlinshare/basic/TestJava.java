package com.fqcheng220.kotlin.kotlinshare.basic;

public class TestJava {
    public static TestJava getNull(){
        return null;
    }

    public void doSth(){

    }

    interface NullArgFuncInterface2 {
        void testNullArgFunc(String str);
        void testMultiNullArgFunc(String str,TestJava testJava);
    }

    public static void testNullArgFuncInterface2(NullArgFuncInterface2 nullArgFuncInterface){
        if(nullArgFuncInterface != null){
            nullArgFuncInterface.testNullArgFunc(null);
            nullArgFuncInterface.testMultiNullArgFunc(null,null);
        }
    }

    interface NullArgFuncInterface {
        void testMultiNullArgFunc(String str,TestJava testJava);
    }

    public static void testNullArgFuncInterface(NullArgFuncInterface nullArgFuncInterface){
        if(nullArgFuncInterface != null){
            nullArgFuncInterface.testMultiNullArgFunc(null,null);
        }
    }
}
