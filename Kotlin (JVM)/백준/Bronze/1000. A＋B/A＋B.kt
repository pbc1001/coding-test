fun main() {

    val (a, b) = readln().split(" ").map { it.toIntOrNull() ?: 0 }

    println(a + b)
}