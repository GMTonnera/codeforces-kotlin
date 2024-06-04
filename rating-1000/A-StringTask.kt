// import java.util.Scanner

fun main(){
    // val scanner = Scanner(System.`in`)
    val s = readLine()
    // println(s)
    var r: String = ""
    for (c: Char in s.toString().lowercase()){
        if (c in arrayOf('a', 'o', 'y', 'e', 'u', 'i')) continue
        else r += ".$c"
    }
    println(r)

}