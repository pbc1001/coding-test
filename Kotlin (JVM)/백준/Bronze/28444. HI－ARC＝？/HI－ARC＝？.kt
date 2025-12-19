fun main() {
    val (a, b, c, d, e) = readln().split(" ").map { it.toLongOrNull() ?: 0 }
    println((a*b)-(c*d*e))
}