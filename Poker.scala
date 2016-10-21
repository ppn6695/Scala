/**
  * Created by pratiksha on 20/10/16.
  */
class Poker {

  val listOfCards = List("HA","H2","H3","H4","H5","H6","H7","H8","H9","HT","HJ","HQ","HK",
    "SA","S2","S3","S4","S5","S6","S7","S8","S9","ST","SJ","SQ","SK",
    "DA","D2","D3","D4","D5","D6","D7","D8","D9","DT","DJ","DQ","DK",
    "CA","C2","C3","C4","C5","C6","C7","C8","C9","CT","CJ","CQ","CK")

  val seq = List("A2345" , "23456" , "34567" , "45678" , "56789" , "6789T" , "789TJ" , "89TJQ" , "9TJQK" , "TJQKA")

  var a = false
  var b = false
  def validateCards(cards : List[String]) = {
    if(cards.forall(listOfCards.contains)){
      println("valid cards")
      isFourOfKind(cards)
      isFlush(cards)
      isStraight(cards)
      if (isPair(cards)==true && isThreeOfKind(cards)==true)println("full house")
      else if(isPair(cards)==true)println("pair")
      else if (isThreeOfKind(cards)==true)println("three of a kind")
    }
    else{
      println("enter valid cardS")
    }
  }

  def isFourOfKind(cards : List[String]) = {

   cards.map(x =>x.charAt(1).toString).groupBy(identity).mapValues(_.size).foreach(x=>if(x._2==4) println("four of a kind"))

  }

  def isThreeOfKind(cards : List[String]) : Boolean = {
    var aa = false
    cards.map(x =>x.charAt(1).toString).groupBy(identity).mapValues(_.size).foreach(x=>if(x._2==3) aa = true)

    aa
  }

  def isPair(cards : List[String]) : Boolean = {
    var aa = false
    cards.map(x =>x.charAt(1).toString).groupBy(identity).mapValues(_.size).foreach(x=>if(x._2==2) aa = true)
    aa
  }

  def isFlush(cards : List[String])  = {

    cards.map(x =>x.charAt(0).toString).groupBy(identity).mapValues(_.size).foreach(x=>if(x._2==5) println("Flush"))

  }

  def isStraight(cards : List[String])  = {

    if(seq.contains(cards.map(x =>x.charAt(1)).reverse.mkString))
      println("Straight")

  }
}
object Poker{
  def main(args: Array[String]): Unit = {

    var cards=List[String]()
    println("enter cards")
    for (i <- 0 to 4){
      val card = scala.io.StdIn.readLine()
      cards ::= card
      //println("entered cards are : " +cards)
    }
    println("entered cards are : " +cards)

    val obj = new Poker
    obj.validateCards(cards)
  }
}