import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val t: Int = scanner.nextInt()

    for (i: Int in 1..t) {
        val s = scanner.next()
        var n1: Int = 0
        var n0: Int = 0
        var r: Long = 0

        for (c: Char in s.toString()) {
            if (c == '1') n1++
            else if (c == '0' && n1 != 0){
                n0++
                r += n1 + 1
            }
        }
        println(r)
    }    
}