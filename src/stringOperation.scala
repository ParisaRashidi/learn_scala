object stringOperation extends App {
    val str: String = "Hello, I am learning Scala"

    println(str.charAt(2))
    println(str.substring(7, 11))
    println(str.split(" ").toList)
    println(str.startsWith("Hello"))
    println(str.replace(" ", "-"))
    println(str.toLowerCase())
    println(str.length)


    val name = "parisa"
    val age = 25
    val greeting = s"Hello, my name is $name and I am $age years old"
    println(greeting)
}
