fun isVowel(lettre : Char){
    val voyelle = listOf('a','e','i','o','u','y')
    val minuscule = lettre.toLowerCase()
    println(voyelle.contains(minuscule))
}// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
