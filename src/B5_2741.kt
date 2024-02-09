import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


/*
fun main(): Unit = with(Scanner(System.`in`)){
    var n = nextInt()

    for(i in 1..n) println("${i}")
}*/

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for(i in 1..br.readLine().toInt()) bw.write("${i}\n")

    bw.flush()
    bw.close()
}
