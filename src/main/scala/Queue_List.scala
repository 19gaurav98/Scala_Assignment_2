class Queue_List(var list: List[Any] = List()) {

  //this function add element to the queue
  def enQueue(element: Any): List[Any] = {
    list = element :: list
    list
  }

 //This function remove element from the queue
  def deQueue: List[Any] = {
    list = list.dropRight(1)
    list
  }

  //This function remove element from the queue
  def front: Any = {
    list.last
  }

 //This method return the rear element from the Queue
  def rear: Any = {
    list.head
  }

    //this method check weather the queue is empty is or not
  def checkEmpty(): Boolean = {
    list match {
      case Nil => true
      case _ => false
    }
  }

  //This method print the element of the queue
  def print(): Unit = {
    println(list)
  }
}
