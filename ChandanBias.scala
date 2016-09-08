import scala.collection.mutable.ListBuffer

/**
  * Created by pratiksha on 7/9/16.
  */
/*class ChandanBias {


    def bias(ll:List[Int]): Unit =
    {
      var sum=0
      for(i<-0 to ll.length-1)
      {
        if(ll(i)!=0)
        {
          sum=sum+ll(i)
        }
        else
        {
          sum=sum-ll(i-1)
        }
      }
      println(sum)
    }
  }
  object ChandanBias
  {
    def main(args: Array[String]): Unit = {
      println("Enter No")
      var N=scala.io.StdIn.readInt().toInt
      var ll=new ListBuffer[Int]()
      println("Enter")
      while(N>0)
      {
        ll+=scala.io.StdIn.readInt().toInt
        N=N-1
      }
      val ob=new ChandanBias
      ob.bias(ll.toList)
    }

}*/
object RecursiveSpeed extends App{
  var count = 1
  def refBc(arr: Array[Int]):Int = {
    if (arr.length>1) {
      if (arr.tail.head > arr.head) {
        Nil
      }
      else {
        count += 1
      }
      refBc(arr.tail)
    }
    else{
      count
    }
  }
  println(refBc(Array(8,3,6,1,5)))
}
