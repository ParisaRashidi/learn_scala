object OOP extends App {
    class Person(name: String, val age: Int = 0) {
      def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
      // over loading
      def greet(): Unit = println(s"Hi, I am $name")

      // multiple constructors
      def this(name: String) = this(name, 0)
      def this() = this("John Doe")
    }

    val person = new Person("parisa", 25)
    person.greet("hafez")
    person.greet()

}
