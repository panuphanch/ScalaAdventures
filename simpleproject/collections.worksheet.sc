// Array Buffer
val abuffer = scala.collection.mutable.ArrayBuffer[Int]()
var nums = scala.collection.mutable.ArrayBuffer(1, 2, 3)
nums += 4
nums += 5 += 6
nums ++= List(7, 8, 9)
nums -= 9
nums -= 7 -= 8
nums --= List(5, 6)

val a = scala.collection.mutable.ArrayBuffer(1, 2, 3)
a.append(4)
// a.append(5, 6) << Deprecated
a.appendAll(Seq(7, 8))
a.clear

val b = scala.collection.mutable.ArrayBuffer(9, 10)
b.insert(0, 8)
b.insertAll(0, Vector(4, 5, 6, 7))
b.prepend(3)
// b.prepend(1, 2) << Deprecated
b.prependAll(Array(1, 2))

val c = scala.collection.mutable.ArrayBuffer.range('a', 'h')
c.remove(0)
c.remove(2, 3)

val d = scala.collection.mutable.ArrayBuffer.range('a', 'h')
// d.trimStart(2) << Deprecated use `dropInPlace` instead
// d.trimEnd(2) << Deprecated use `dropRightInPlace` instead
d.dropInPlace(2)
d.dropRightInPlace(2)


// List
val list = List(1, 2, 3)
val list0 = 0 +: list
var list4 = list :+ 4
val list2 = List(5, 6)
val listx = list ::: list4
val listrange1 = (1 to 5).toList
val listrange2 = (1 to 10).toList
val listrange3 = (1 until 5).toList
val listrange4 = List.range(1, 5)
val listrange5 = List.range(1, 10, 3)


// Map
val items = Map(
    "CPU" -> "100",
    "Ram" -> "200",
    "Monitor" -> "300"
)
items.keys
items.values

val states = collection.mutable.Map("AK" -> "Alaska")
states += ("AL" -> "Alabama")
states ++= Map("AR" -> "Arkansas", "AZ" -> "Arizona", "CA" -> "California", "CO" -> "Colorado")
states -= "AR"
states --= List("AL", "AZ")
states("AK") = "Alaska, A Really Big State"
states("AK")
val ratings = Map(
    "Lady in the Water" -> 3.0,
    "Snakes on a Plane" -> 4.0,
    "You, Me and Dupree" -> 3.5
)
for (rating <- ratings) println(s"$rating._1, $rating._2")
for ((k, v) <- ratings) println(s"$k, $v")
ratings.foreach { case (k, v) =>
    println(s"$k = $v")
}


// Set - Sequence that not duplicate
val set = scala.collection.mutable.Set[Int]()
set += 1
set += 2 += 3
set ++= Vector(4, 5)
set += 2
set.add(6)
set
set -= 1
