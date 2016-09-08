/**
  * Created by pratiksha on 6/9/16.
  */
class SumOfWeights {

}

object SumOfWeights{
  def main(args: Array[String]): Unit = {
    val list=List(1,2,5,5)
    var sow=list.distinct.map(x=>x*((list.indexOf(x))+1)).sum
    println(sow)
  }
}