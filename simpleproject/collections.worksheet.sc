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