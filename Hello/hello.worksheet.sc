println("Hello World")
val value = "x"
var vari = 0
vari = -1
println(vari)

// if-elseif-else
val result = 
	if (vari == 0) "It is zero" 
	else if (vari > 0) "Greater than zero" 
	else "Less than zero"

val list = List(1, 2, 3)
// for
for { item <- list } print(item)
// for-each
list.foreach(item => println(item))
// for-expression
for { item <- list } yield item + 1

def addOne(list: List[Int]) = {
	def recur(o: List[Int], n:List[Int]): List[Int] = {
		if (o.isEmpty) n
		else recur(o.tail, n :+ o.head + 1)
	}
	recur(list, List())
}

addOne(list)
