const val MODULAR = 15746


fun main() {
    val n = readLine()!!.toInt()
    if (n == 1) {
        println(1)
        return
    } else if (n == 2) {
        println(2)
        return
    }

    var pre = 2L
    var prepre = 1L
    for (x in 3 until n) {
        val tmp = prepre % MODULAR
        pre %= MODULAR
        prepre = pre
        pre += tmp
    }
    println((pre + prepre) % MODULAR)
}


