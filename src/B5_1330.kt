import java.util.*
import java.lang.*
fun main(): Unit {

    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()

    println(when {
        a > b -> ">"
        a == b -> "=="
        else -> "<"
    }
    )
}