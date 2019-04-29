package funsets

object Main extends App {
  import FunSets._
  println("True : " + contains(singletonSet(1), 1))
  println("False : " + contains(singletonSet(1), 0))
  printSet(union((x: Int) => x%2 == 0, (y: Int) => y%2 != 0))
  printSet(intersect((x: Int) => x%2 == 0, (y: Int) => y%10 == 0))
  printSet(diff((x: Int) => x < 10, (y: Int) => y < 0))
  printSet(filter((x: Int) => x%2 == 0, (y: Int) => y%10 == 0))
  println("True : " + forall((x: Int) => x%4 == 0, (x: Int) => x%2 == 0))
  println("False : " + forall((x: Int) => x%4 == 0, (x: Int) => x%3 == 0))
  println("True : " + exists((x: Int) => x%2 == 0, (x: Int) => x%8 == 0))
  println("False : " + exists((x: Int) => x%2 == 0, (x: Int) => x%2 == 1))
  printSet(map((x: Int) => x > 0 && x < 10, (y: Int) => y*2))
}
