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

class Task {
	var id: Int = 0
	var title: String = ""
	var state: Int = 1
	def next() = {
		if (state == 3) 3 else state += 1
	}
}

object Task {
	def apply(id: Int, title: String, state: Int) = {
		var t = new Task
		t.id = id
		t.title = title
		t.state = state
		t
	}
	def apply(id: Int, title: String) = {
		var t = new Task
		t.id = id
		t.title = title
		t
	}
}

val buyBanana = Task(id = 0, title = "Buy Banana")
buyBanana.next()
buyBanana.state
buyBanana.next()
buyBanana.state
buyBanana.next()
buyBanana.state

