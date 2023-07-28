var neverNull: String = "This can't be null"
var nullable: String? = "This can be null"

fun strLength(notNull: String): Int {
    return notNull.length
}

fun strLength2(maybeString: String?): Int {
    if (maybeString != null) {
        return maybeString.length;
    }
    return -1;
}

fun strLength3(maybeString: String?): Int? = maybeString?.length

fun main() {
    //neverNull = null
    nullable = null
    //println(strLength(nullable))

    val nullString: String? = null
    println(nullString?.uppercase())

    var nullString: String? = null
    println(nullString?.length ?: 0)
}