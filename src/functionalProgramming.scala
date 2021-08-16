object functionalProgramming extends App {

  // function types function2[A,B,R]  ----- (A,B) => R
  // function traits up to 22 parameters
  val adder:((Int,Int) => Int) = new Function2[Int,Int,Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  val concatinator:((String,String) => String) = new Function2[String,String,String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }
  println(concatinator("parisa ","Rashidi"))

  //curried function : function that returns another function
  // function1[Int, Function1[Int, Int]]
  val superAdder: (Int) => Function1[Int, Int] = new Function1[Int, Function1[Int, Int]] {
    override def apply(v1: Int): Function1[Int , Int] = new Function1[Int, Int] {
      override def apply(v2: Int): Int = v1 + v2
    }}
  // Higher Order Functions such as map, flatmap, filter


  println(superAdder(3)(4))

  val doubler:(Int => Int) = new Function[Int, Int] {
      override def apply(v1: Int): Int = v1 * 2
    }
  //or in scala you can simply write: instantiate function1 this called anonymous function - lambda
   var doubler2: Int => Int = x => x * 2

  //multiple parameters in lambda
  val adder_lambda:(Int,Int) => Int = (a: Int,b: Int) => a + b


}