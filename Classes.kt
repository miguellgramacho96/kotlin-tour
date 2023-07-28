import kotlin.random.Random

class Customer

class Contact(val id: Int, var email: String)

class Contact2(val id: Int, var email: String) {
    val category: String = ""
}

val contact2 = Contact2(1, "miguel@gmail.com")

class Contact3(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

val contact3 = Contact3(2, "miguel@hotmail.com")

data class User(val name: String, val id: Int)

val user = User("Miguel", 1)
val secondUser = User("Miguel", 1)
val thirdUser = User("Max", 2)

data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(val minSalary: Int, val maxSalary: Int) {
    private val names = listOf("Miguel", "Bruno", "Alex", "Gonçalo", "Fred", "Ricardo", "Luciano", "João")
    fun generateEmployee() = Employee(
        names.random(),
        Random.nextInt(from = minSalary, until = maxSalary)
    )
}

fun main() {
    println(contact2.email)
    contact2.email = "miguell@gmail.com"
    println(contact2.email)

    contact3.printId()

    println(user.toString())
    println(user)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println(user.copy())
    println(user.copy(name = "Max"))
    println(user.copy(id = 2))
    exerciseClasses1()
}

fun exerciseClasses1() {
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}