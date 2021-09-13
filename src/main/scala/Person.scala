class Person(val name: String, val age: Int) extends Ordered {
  def check(personTwo: Person): Unit = {

    if(this.name.equals(personTwo.name)){
      if (this.age<personTwo.age){
        println("True")
      }
      else{
        println("False")
      }
    }
    else{
      if (this.name.length<personTwo.name.length) {
        println("True")
      }
      else
      {
        println("False")
      }

    }
  }
}
