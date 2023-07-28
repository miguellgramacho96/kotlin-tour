val readOnlyShapes = listOf("triangle", "square", "circle")
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapesLocked: List<String> = shapes

val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
val fruitLocked: Set<String> = fruit

var readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100)
val accountBalances: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val accountsBalancesLocked: Map<Int, Int> = accountBalances

fun main() {
    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("This list has ${readOnlyShapes.count()} items")
    println("circle" in readOnlyShapes)

    shapes.add("pentagon")
    println(shapes)
    shapes.remove("pentagon")
    println(shapes)

    println(readOnlyFruit)
    println("This set has ${readOnlyFruit.count()} items")
    println("banana" in readOnlyFruit)
    fruit.add("dragonfruit")
    println(fruit)
    fruit.remove("dragonfruit")
    println(fruit)

    println("The first value in map is: ${readOnlyAccountBalances[1]}")
    println("The map has ${readOnlyAccountBalances.count()} key-pairs")
    accountBalances[4] = 100
    println(accountBalances)
    accountBalances.remove(4)
    println(accountBalances)
    println(readOnlyAccountBalances.containsKey(2))
    println(readOnlyAccountBalances.keys)
    println(readOnlyAccountBalances.values)
    println(2 in readOnlyAccountBalances)
    println(200 in readOnlyAccountBalances)

    exercise1()
    exercise2()
    exercise3()
}

fun exercise1() {
    val greenNumbers = listOf(1, 4, 13)
    val redNumbers = listOf(17, 2)

    println("Total of ${greenNumbers.size + redNumbers.size} numbers")
}

fun exercise2() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

fun exercise3() {
    val number2word = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}