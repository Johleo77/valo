class BankAccount(deposited : Long , withdrawn : Long) {
    var deposited = deposited
    var withdrawn = withdrawn
    var balance = deposited - withdrawn
}


fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}