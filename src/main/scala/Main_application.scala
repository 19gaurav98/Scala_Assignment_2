object Main_application extends App {
  val integerList = List(2,4,5,6,7,8,9,10,11,21,12,44,55,66)

  val list_last = new List_last
  val list_table = new List_table

  // last element of the list
  val lastElement = list_last.List_last(integerList)

  println("Last Element => " + lastElement)



  println(" \n Table of each element in the list ====>>> ")

  // table of each element of the list
  for (element <- integerList) {
    println(s"Table of element = $element")
    list_table.list_table(element)
    println()
  }

  // This object is stack class
  val stack = new Stack_List[Int]

  stack.push(11)
  stack.push(21)
  stack.push(31)
  stack.push(41)
  stack.push(51)

  stack.peek

  println(stack.pop)
  println(stack.pop)
  println(stack.pop)

  stack.peek
  stack.peek

  // This object is for Queue
  val queue = new Queue_List

  queue.enQueue(1)
  queue.enQueue(2)
  queue.enQueue(3)
  queue.enQueue(5)
  queue.enQueue(7)
  queue.enQueue(11)

  queue.rear
  queue.rear
  queue.rear

  println(queue.deQueue)
  println(queue.deQueue)

  queue.rear
  queue.rear
}

