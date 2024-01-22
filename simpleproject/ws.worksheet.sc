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

class Person {
	var name: String = ""
	var age: Int = 0
	def accessPrivateInformation() = println(Person.PrivateFileName)
}

object Person {
	def apply(name: String) = {
		var p = new Person
		p.name = name
		p
	}
	def apply(name: String, age: Int) = {
		var p = new Person
		p.name = name
		p.age = age
		p
	}
	private val PrivateFileName = "/usr/save/private"
}

val p1 = Person("Meee")
val p2 = Person("Meee", 37)
p1.name
p1.age
p2.name
p2.age