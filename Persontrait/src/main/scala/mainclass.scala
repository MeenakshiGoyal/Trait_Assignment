//object class
object main extends App {
  val personOne = new Person("Test", 24)
  val personTwo = new Person("Test", 25)
  val personThree = new Person("TestAgain", 24)
  val personFour = new Person("Test", 25)
  println(personOne < personTwo)
  println(personThree < personFour)

}
