fun main() {
    val word: String = readLine()!!.toString()
    var flag: Boolean = true

    if (word[0].isLowerCase()) {
        for (i: Int in 1..(word.length-1)){
            if (word[i].isLowerCase()) {
                flag = false
                break
            }
        }
        if (flag) println(word.lowercase().replaceFirst(word[0], word[0].uppercaseChar()))
        else println(word)

    }
    else {
        for (i: Int in 0..(word.length-1)){
            if (word[i].isLowerCase()) {
                flag = false
                break
            }
        }
        if (flag) println(word.lowercase())
        else println(word)
    }
}