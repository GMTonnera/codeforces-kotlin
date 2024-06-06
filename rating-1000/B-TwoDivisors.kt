import java.util.Scanner

fun main () {
    val scanner: Scanner = Scanner(System.`in`)
    val t: Int = scanner.nextInt()

    for (i: Int in 1..t) {
        val a: Long = scanner.nextLong()
        val b: Long = scanner.nextLong()

        if (a == 1.toLong()) println(b*b)
        else if (b % a == 0.toLong()) println(b / a * b)
        else if (b % a != 0.toLong()) println(a * b / gcd(b, a)) 
    }
}

fun gcd(a: Long, b: Long): Long {
    if (b == 0.toLong()) return a
    return gcd(b, a % b)
}