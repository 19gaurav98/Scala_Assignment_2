import org.scalatest.flatspec.AnyFlatSpec

class List_lastTest extends AnyFlatSpec {

  "List_last" should "give last Element of the list" in {
    val li = List(5, 6, 7)
    val lastele = new List_last
    val result = lastele.List_last(li)

    assert(result == 7)
  }

}