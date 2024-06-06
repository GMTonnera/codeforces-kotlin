import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val t: Int = scanner.nextInt()

    for (i: Int in 1..t) {
        val n: Int = scanner.nextInt()
        var l1: MutableList<Int> = mutableListOf()
        var l2: MutableList<Int> = mutableListOf()

        for (j: Int in 1..n-1) {
            l1.add(scanner.nextInt())
        }

        l2.add(1000)
        for(j: Int in l1.indices) {
            l2.add(l2[j]+l1[j])
        }
        println(l2.joinToString().replace(",", ""))
    }
}