fun hello() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun singleExpressionSum(x: Int, y: Int) = x + y

fun main() {
    hello()
    printMessageWithPrefix("test")
    printMessageWithPrefix(prefix = "debug", message = "Hello")

    println(
        { string: String -> string.uppercase() } ("hello")
    )

    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello"))

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)
    println(tripled)

    val upperCaseString2: (String) -> String = { string -> string.uppercase() }
    val lambdaWithoutParamWithReturn: () -> String = { "mock" }

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()

    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })
    println(listOf(1, 2, 3).fold(1) { x, item -> x + item })
}

fun toSeconds(time: String): (Int) -> Int = when(time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun functionsExercise1() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)
}

fun repeatN(n: Int, action: () -> Unit) {
    for (number in 1..n) {
        action()
    }
}

fun functionsExercise2() {
    repeatN(5) { println("Hello") }
}