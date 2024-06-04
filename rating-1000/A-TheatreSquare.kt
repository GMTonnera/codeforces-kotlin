import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var n: Long = scanner.nextLong()
    var m: Long = scanner.nextLong()
    var a: Long = scanner.nextLong()
    
    val x: Long = if ((n / a) * a < n) (n/a + 1) else n/a
    val y: Long = if ((m / a) * a < m) (m/a + 1) else m/a

    print(x*y)
}