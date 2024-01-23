val ints = (1 to 10).toList
ints.map(in => in + 1)
ints.map(_ + 1)
ints.filter(_ > 5)
ints.filter(_ > 5).reduce(_ + _)

val items = Map(
    "a" -> 1,
    "b" -> 2,
    "c" -> 3,
    "d" -> 4
)
items.keys
items.values
items.values.reduce(_ + _)
items.values.sum
items.view.filterKeys(Set("b", "c")).toMap.values.sum
