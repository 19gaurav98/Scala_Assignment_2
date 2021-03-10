import org.scalatest.flatspec.AnyFlatSpec

class Queue_listTEst extends AnyFlatSpec {

  val emptyStack = new Stack_List[Int]

  "peek" should "return the top of the stack for non-empty stack" in {
    val nonEmptyStack = Stack_List[Int](5,10,15,20,25,30,35)

    val topElement = nonEmptyStack.peek
    assert(topElement == 35)
  }


  "pop" should "throw exception for non-empty stack" in {
    assertThrows[NoSuchElementException] {
      emptyStack.pop
    }
  }
}