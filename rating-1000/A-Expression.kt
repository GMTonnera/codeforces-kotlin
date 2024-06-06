import java.util.Scanner

fun main(){
    val scanner: Scanner = Scanner(System.`in`)
    val a: Int = scanner.nextInt()
    val b: Int = scanner.nextInt()
    val c: Int = scanner.nextInt()
    
    if (a == 1 && b == 1 && c == 1) println(a + b + c)
    else if (a == 1 && b == 1) println((a + b) * c)
    else if (b == 1 && c == 1) println(a*(b + c))
    else if (a == 1 && c == 1) println(a + b + c)
    else if (a == 1) println((a + b) * c) 
    else if (b == 1) {
        if (a > c) println(a*(b+c))
        else println((a+b)*c)
    }
    else if (c == 1) println(a*(b+c))
    else println(a * b * c)
}