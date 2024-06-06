import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    var s: Int = scanner.nextInt()
    val n: Int = scanner.nextInt()
    var dragons: MutableList<List<Int>> = mutableListOf()
    var flag: Boolean = true

    for (i: Int in 1..n) {
        dragons.add(listOf(scanner.nextInt(), scanner.nextInt()))
    }

    dragons.sortBy { it.first() }

    for (d: List<Int> in dragons) {
        if (s > d[0]) s += d[1]
        else {
            flag = false
            break
        }
    }

    if (flag) println("YES")
    else println("NO")
}
