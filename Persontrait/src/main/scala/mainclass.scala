class PersonImpl  {
  // Method to compare two objects
  def isCompare():Boolean={
    val p1 = new Person("Test", 24)
    val p2 = new Person("Test", 25)
    if((p1.compare(p2) == 1))
       true
    else
     false
  }
}
object main extends App {
  val personImpl = new PersonImpl()
  println(personImpl.isCompare())
}
