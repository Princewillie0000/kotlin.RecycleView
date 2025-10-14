package com.example.recyclerviewexample

class SomeRegularClass {

        val myInnerInstance = MyInnerClass()

       var someRegularProperty = 1
       fun someRegularFunction(){
           val someVariable = myInnerInstance.myInnerProperty
           myInnerInstance.myInnerFunction()

    }

    inner class MyInnerClass(){

        val myInnerProperty = 1
        fun myInnerFunction(){
            someRegularProperty++

        }

    }



}