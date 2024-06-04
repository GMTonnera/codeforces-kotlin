import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val n: Int = scanner.nextInt()
    var xR: Int = 0
    var yR: Int = 0
    var zR: Int = 0
    
    for(i in 1..n){
        xR += scanner.nextInt()
        yR += scanner.nextInt()
        zR += scanner.nextInt()
    }
    if (xR == 0 && yR == 0 && zR == 0) println("YES")
    else println("NO")
}