"Hello Worlddddd"
1+4
println("Hello,Scalla")

def FizzBuzz(n: Int): Unit = {
  1 to n foreach { i =>
    println((1 % 3, i % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => i
    })

  }
}
FizzBuzz(15)

object HelloScala extends App{
  println("Hello Scala!")
}