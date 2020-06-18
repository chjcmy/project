import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var input = StringTokenizer(br.readLine())
    var n = Integer.parseInt(input.nextToken())
    var m = Integer.parseInt(input.nextToken())

    if (n < m)
       print("<")
     else if (n > m)
       print(">")
     else
        print("==")


}