import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val n: Int = scanner.nextInt()
    val m: Int = scanner.nextInt()
    var r: Long = 0
    var p: Int = 1

    for (i: Int in 1..m) {
        val a: Int = scanner.nextInt()
        if (p == a) continue
        else if (p < a) {
            r += a - p
            p = a
        }
        else if (p > a) {
            r += n - (p - a)
            p = a
        }
    }

    println(r)
}