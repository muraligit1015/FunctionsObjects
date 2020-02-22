package com.scala.training

object FunctionsIObject {

  def main(args: Array[String]): Unit = {

    val x1 = args(0)
    val x2 = args(1)
    println("the concat is "+ x1 + x2)

  }
val a1 = new FunctionMethods //  object creation for method 1

  a1.m1()
  a1.m2(10,20)

  val a2 = new FunctionObjects2 //object creation for  methos 2

  a2.m4(10,30)

 val a3 = new FunctionsMethods3
  a3.method3(10,20,30)

  a1.m5(10,23)



}


