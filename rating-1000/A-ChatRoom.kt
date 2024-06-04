fun main(){
    val s: String? = readLine()
    val hello: String = "hello"
    var n: Int = 0

    for (c: Char in s.toString()) {
        if (n == 5) break
        if (c == hello[n]) n++
    }

    if (n == 5) println("YES")
    else println("NO")
}