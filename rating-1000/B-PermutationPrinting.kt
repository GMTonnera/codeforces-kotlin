import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val t: Int = scanner.nextInt()

    for (i: Int in 1..t) {
        val n: Int = scanner.nextInt()
        val l: MutableList<Int> = mutableListOf()

        for (j: Int in 1..(n+1)/2) {
            l.add(j)
            if (n-(j-1) > n || j == n-(j-1)) continue
            else l.add(n-(j-1))
        }
        println(l.joinToString().replace(",", ""))
    }
}