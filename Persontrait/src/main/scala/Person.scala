// A class with ordered trait
class Person(val name:String , val age:Int) extends Ordered[Person]{
  def compare(that:Person):Int= {   //Method to do comparison along with their name and age
    if (this.name == that.name) {
      if (this.age < that.age) {
        1
      }
      1
    }
    else{
      if(this.name.length == that.name.length){
        1
      }
      else{
        0
      }
    }

  }

}




