package edu.knoldus

import org.apache.log4j.Logger

object UsingApplication extends App {

  val log = Logger.getLogger(this.getClass)


  val obj = new Application

  val a = 5
  val b = 4
  val c = 6
  val operation = "sum"


  val intSum = obj.sum((a, b) => a + b, a, b)
  val squareSum = obj.sum((a, b) => a * a + b * b, a, b)
  val cubeSum = obj.sum((a, b) => a * a * a + b * b * b, a, b)
  log.info("square function = " + intSum + "\n")
  log.info("Ints function = " + squareSum + " \n")
  log.info("cube function = " + cubeSum + " \n")


  //val ans = obj.operateList(List(a, b, c), operation, func(List(a,b,c),operation))
}
