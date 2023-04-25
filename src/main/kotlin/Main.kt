import java.util.Random

fun main() {
   multiples()
    var current=CurrentAccount("09086532567","dIANA",200879.98)
    current.deposit(4000.0)
    println(current.balance)
    current.withdrawal(3000.0)
    println(current.balance)
    var account=savingsAccount("diana","2640u",267898.9,3)
 println(account.withdrawal(1.2))


    var y =randomString("BRIAN")
    println(y)
    println(valid("23FJABOJ"))


}
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(){
    for(i in 1..1000){
        if (i %6 ===0 && i %8===0){
            println("bingo")
    }
        else if(i %6===0){
            println("${i} divisible by 6")
        }
        else if(i%8===0){
            println("${i} divisible by 8")
        }

        else{
            println(i)
        }
}
}
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
 open class CurrentAccount(var accountnumber:String,var accountname:String,var balance:Double){
    fun deposit(amount:Double):Double{
        balance=balance+amount
        return balance
    }
    open fun withdrawal(amount:Double):Double{
        balance=balance-amount
        return  balance
    }
    fun details(){

        println("Account number${accountnumber} with balance ${balance}is operated by${accountname}")
    }

}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class savingsAccount(accountname: String,accountnumber: String,balance: Double ,var withdrawal:Int)
    :CurrentAccount(accountnumber, accountname, balance){
    override fun withdrawal(amount: Double): Double {
       balance=balance+amount
        return balance
    }
}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun randomString(name:String):Int{
    var x =name.length
    return x

}
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun valid (password:String) {

    var b = password.length

    if (password.length < 8 && password.length <= 16) {

    }

}






