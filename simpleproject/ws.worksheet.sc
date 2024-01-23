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

object States extends scala.Enumeration {
	type State = Value
	var Todo, Doing, Done = Value
}

trait TaskTrait {
	val id: Int
	def next(): TaskTrait
	def previous(): TaskTrait
}

case class Task(id: Int, title: String, state: States.State = States.Todo) extends TaskTrait {
	import States._
	def next(): Task = {
		if (state == Todo) copy(state = Doing)
		else copy(state = Done)
	}

	def previous(): Task = {
		if (state == Done) copy(state = Doing)
		else copy(state = Todo)
	}
}

val buyBanana = Task(id = 0, title = "Buy Banana")
val buyingBanana = buyBanana.next()
buyBanana
buyingBanana
val doneBuyBanana = buyingBanana.next()

val something = 1
something match {
	case 1 => println("One")
	case 2 => println("Two")
	case _ => println("Other")
}

case class Something(content: String) {}
val first = Something("first")
val second = Something("second")
val third = Something("third")

third match {
	case Something(content) if (content == "first") => println("FIRST")
	case Something(content) if (content == "second") => println("SECOND")
	case _ => println("ELSE")
}

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