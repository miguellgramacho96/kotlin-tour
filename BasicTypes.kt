var papers = 10

fun main() {
    papers = 8
    papers = papers + 3
    papers += 7
    papers -= 3
    papers *= 2
    papers /= 3

    println(papers)

    val d: Int
    d = 3
    val e: String = "hello"
}

fun exerciseBasicTypes() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}