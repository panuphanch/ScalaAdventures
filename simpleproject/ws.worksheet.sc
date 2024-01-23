import java.awt.Taskbar.State
class ScalaClass(value: String) {
	def oneParameter(x: String) = x
	def >>(some: String) = s">>$some"
	def ->:(none: String) = s"-> $none"
}

val sc = new ScalaClass("Something")
// One parameter can remove `.` and `()`
sc.oneParameter("skooldio")
sc oneParameter "skooldio"
sc.>>("skooldio")
sc >> "skooldio"
sc.->:("skooldio")
// Can switch left and right hand in some case
"skooldio" ->: sc

object Logger {
	def info(message: String): Unit = println(s"INFO: $message")
}

class Project(name: String, daysToComplete: Int)

class Test {
	import Logger._
	val project1 = new Project("TPS Reports", 1)
	val project2 = new Project("Website redesign", 5)
	info("Created projects")
}

val test = new Test

case class Person(name: String, age: Int) {}

val p1 = Person("Meee", 37)
val p2 = Person("Meee", 37)
p1 == p2
p1.toString()

// Pattern matching
val something = 1
something match {
	case 1 => println("One")
	case 2 => println("Two")
	case _ => println("Other")
}

// class pattern matching
case class Something(content: String) {}
val first = Something("first")
val second = Something("second")
val third = Something("third")

third match {
	case Something(content) if (content == "first") => println("FIRST")
	case Something(content) if (content == "second") => println("SECOND")
	case _ => println("ELSE")
}

// Tuple pattern matching
object Count {
	def fizzBuzz(value: Int) = {
		val (fizz, buzz) = ((value % 3 == 0), (value % 5 == 0))
		(fizz, buzz) match {
			case (true, true) => "FizzBuzz"
			case (true, false) => "Fizz"
			case (false, true) => "Buzz"
			case _ => value.toString()
		}
	}
}

Count.fizzBuzz(15)
Count.fizzBuzz(5)
Count.fizzBuzz(3)
Count.fizzBuzz(1)

// Type pattern matching
trait Animal {
	val name: String
}

case class Dog(name: String) extends Animal {}
case class Cat(name: String) extends Animal {}

val charlie = Dog("Charlie")
val jinro = Cat("Jinro")

object Caller {
	def say(animal: Animal) = {
		animal match {
			case Dog(name) => println(s"$name says Woof")
			case Cat(_) => println("Meow") // Use `_` to ignore parameter
			case _ => println("????")
		}
	}
}

Caller.say(charlie)
Caller.say(jinro)

/// Todo

// object States extends scala.Enumeration {
// 	type State = Value
// 	var Todo, Doing, Done = Value
// }

// trait State
// case object Todo extends State
// case object Doing extends State
// case object Done extends State

trait Task {
	val id: Int
	def next(): Task
}

case class Todo(id: Int, title: String) extends Task {
	def next(): Doing = Doing(id, title)
}

case class Doing(id: Int, title: String) extends Task {
	def next(): Done = Done(id, title)
}

case class Done(id: Int, title: String) extends Task {
	def next(): Done = this
}

val buyBanana = Todo(id = 0, title = "Buy Banana")
val buyingBanana = buyBanana.next()
// buyBanana
// buyingBanana
val doneBuyBanana = buyingBanana.next()