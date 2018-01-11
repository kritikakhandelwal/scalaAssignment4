package edu.knoldus

import org.apache.log4j.Logger

class Application {

  val log = Logger.getLogger(this.getClass)


  def sum(f: (Int, Int) => Int, a: Int, b: Int): Int = {

    f(a, b)
  }


    def operateList(list: List[Int], operation: String, func: (List[Int], String)):Int = {

       list match {
        case Nil => 0
        case head :: Nil => (s"$operation = 1")
        case _ => s"$operation = ${func(list, operation)}"

      }

      def function(list: List[Int], operation: String): Int = {

        if (operation == "sum")
          list.head + function(list.tail, operation)

        else operation == "product"
        list.head * function(list.tail, operation)

      }

     }



}
