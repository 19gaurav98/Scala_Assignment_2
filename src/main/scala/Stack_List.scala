class Stack_List[A] {
  private var stack_List: List[A] = List()

  //This Push Function will add element to the top of the Stack
  def push(value: A): Unit = {
    stack_List = stack_List :+ value
  }

  //This pop Function will pop out the top element from the stack
  def pop = {
    val popValue = stack_List.last
    stack_List = stack_List.dropRight(1)

    popValue
  }

  //This isEmpty Function tell us wheather the stack is empty or not
  def isEmpty = stack_List.isEmpty

  //It pop out the top element from the stack
  def peek = stack_List.last

  //This length function tell the number of element in the stack
  def length = stack_List.length

  override def toString = stack_List.toString()
}

object Stack_List {
  def apply[A](elements: A*) = {
    val stackObject = new Stack_List[A]

    for (e <- elements) {
      stackObject.push(e)
    }
    stackObject
  }
}