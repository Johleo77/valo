fun main() {
    var n = mutableListOf(5, 5, 1, 4, 2, 3)
    var i = 0
    var res = n[0]
    for (i in n) {
        if (n[i] < res) {
            res = n[i]
        }
    }
    println(res)
}



