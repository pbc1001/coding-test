fun main() {
    val a = readln()
    var b = a.toInt()
    var c :Long = 0
    for (i in 0 until b) {
        val d = readln()
        val h = d.length
        print(d[0])
        println(d[h-1])
    }
}