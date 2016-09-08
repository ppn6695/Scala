import scala.collection.mutable.ListBuffer

/**
  * Created by pratiksha on 7/9/16.
  */
class Car {

  def car(lst: List[Int]): Int = {
    var count = 1
    for (i <- 0 to lst.length-2 ) {
      if (lst(i) > lst(i + 1)) {
        count = count + 1
      }
      else
        count=count
    }
    count
  }
}

object Car
{
  def main(args: Array[String]): Unit = {
    println("No")
    var N=scala.io.StdIn.readInt().toInt
    var ll=new ListBuffer[Int]()
    println("Enter")
    while(N>0)
    {
      ll+=scala.io.StdIn.readInt().toInt
      N=N-1
    }
    val ob=new Car
    println( ob.car(ll.toList))
  }
}
