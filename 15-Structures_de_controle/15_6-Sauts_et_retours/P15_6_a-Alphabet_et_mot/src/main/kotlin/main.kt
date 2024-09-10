fun main() {
    val word = "hello"
    var alpha : MutableList<Char> = mutableListOf()
    for (i in 'a'..'z')
    {
        alpha.add(i)
    }
    for(lettre in alpha){
        if(lettre in word){
            continue
        }
        print(lettre)
    }

}