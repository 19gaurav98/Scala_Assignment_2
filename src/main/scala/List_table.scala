//This class is used to print the table of each element in a list


class List_table {
  //This function is used to print the table of each element in the list
  def list_table(ele: Int) = {

    for (n1 <- 1 until (11)) {
      println(ele + " * " + n1 + " = " + (ele * n1))
    }


  }

}
