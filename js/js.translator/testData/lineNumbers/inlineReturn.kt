inline fun foo(x: Int): String {
    if (x == 1) {
        return "a" +
               x
    }

    print("!")

    if (x == 2) {
        return "b" +
               x
    }

    println("#")

    return x.toString()
}

fun bar(x: Int) {
    println(foo(x + 1))
    println("%")
}

// LINES: 17 2 2 3 4 7 9 9 10 11 14 16 22 20 * 2 2 3 4 3 7 9 9 10 11 10 14 16 * 20 21