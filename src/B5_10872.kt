import java.util.*

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    var result = 1

    for(i in 1..n) result *= i

    println(result)
}