import java.util.Scanner

fun main(){
    val scanner: Scanner = Scanner(System.`in`)
    val n: Int = scanner.nextInt()
    val luckyNums: Array<Int> = arrayOf(4, 7, 44, 47, 74, 77, 444, 447, 477, 744, 747, 774, 777)
    var flag: Boolean = false

    for (i: Int in luckyNums){
        if (n >= i && n % i == 0) {
            flag = true
            break
        }
    }

    if (flag) println("YES")
    else println("NO")
}