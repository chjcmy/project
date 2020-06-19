import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var a = Integer.parseInt(br.readLine())
    var b = Array<IntArray>(42,{IntArray(2)})

    b[0][0] = 1
    b[1][1] = 1
    for (i in 2..41) {
        for (j in 0..1) {
            b[i][j] = b[i-1][j] + b[i-2][j]
        }
    }

   
    for (i in 0 until a) {
        var c = Integer.parseInt(br.readLine())
        println("${b[c][0]} ${b[c][1]}")
    }
}

