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

case class Task(id: Int, title: String, state: States.State = States.Todo) {
	import States._
	def next(): Task = {
		if (state == Todo) copy(state = Doing)
		else copy(state = Done)
	}
}

val buyBanana = Task(id = 0, title = "Buy Banana")
val buyingBanana = buyBanana.next()
buyBanana
buyingBanana
val doneBuyBanana = buyingBanana.next()
