
fun fibonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun fibonacci2(n: Int): Int {
    var a = 0
    var b = 1
    var c = 0
    for (i in 1..n) {
        c = a + b
        a = b
        b = c
    }
    return a
}

fun main(args: Array<String>) {
    println(fibonacci(42))
}
