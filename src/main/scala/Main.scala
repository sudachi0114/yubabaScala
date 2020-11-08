import java.util.Scanner
import scala.util.Random

object Main extends App {
  println("契約書だよ。そこに名前を書きな。")

  val scanner = new Scanner(System.in)
  scanner.useDelimiter("\n")
  val name: String = scanner.nextLine()

  printf("フン。%sというのかい。贅沢な名だねェ。\n", name)

  val nameVector = name.toVector
  println(nameVector.length, nameVector(0))

  val newName = nameVector(Random.nextInt(name.length))
  printf("今からお前の名前は%sだ。いいかい、%sだよ。わかったら返事をするんだ、%s!!\n", newName, newName, newName)
}