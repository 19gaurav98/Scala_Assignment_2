import scala.annotation.tailrec

class List_last {

  //This function Recursively find the last element of the list
  @tailrec final def List_last(integerList: List[Int]): Int = {
    integerList match {
      case last :: Nil => (last)
      case last :: remainingList => List_last(remainingList)

    }
  }
}