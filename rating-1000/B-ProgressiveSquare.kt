import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val t: Int = scanner.nextInt()

    for (i: Int in 1..t) {
        val n: Int = scanner.nextInt()
        val c: Int = scanner.nextInt()
        val d: Int = scanner.nextInt()
        var l1: MutableList<Int> = mutableListOf()
        var l2: MutableList<Int> = mutableListOf()
        var flag: Boolean = true

        for (j: Int in 1..n*n) {
            l1.add(scanner.nextInt())
        }
        l1.sort()
        for (j: Int in 0..n-1) {
            val x: Int = l1[0]+c*j
            for (k: Int in 0..n-1) {
                l2.add(x+d*k)
            }
        }
        l2.sort()

        for(j: Int in l1.indices) {
            if (l1[j] != l2[j]) {
                flag = false
                break
            }
        }
        
        if (flag) println("YES")
        else println("NO")

    }

}