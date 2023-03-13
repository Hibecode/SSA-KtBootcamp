

fun main() {


    var myBank = BankAccount()

    myBank.deposit(4000)
    myBank.deposit(50000)

    myBank.withdraw(25000)

}

// Sample project
class BankAccount() {

    var balance: Int = 0
    var name: String? = null

    fun deposit(amount: Int) {
        balance += amount
        println("You have deposited $$amount into your account.")
        checkBalance()
    }

    fun withdraw(amount: Int) {
        balance -= amount
        println("You have withdrawn $$amount from your account")
        checkBalance()
    }

    fun checkBalance() {
        println("\nYour account balance is $$balance")
    }
}














// Interfaces
interface Pluggable {

    val neededWattToWork: Int

    fun electricityConsumed(wattLimit: Int): Int

    fun turnOff()

    fun turnOn()
}

class Microwave: Pluggable {


    override val neededWattToWork = 15

    override fun electricityConsumed(wattLimit: Int): Int {
        return if (neededWattToWork > wattLimit) {
            turnOff()
            0
        } else {
            turnOn()
            neededWattToWork
        }
    }

    override fun turnOff() {
        println("Turning Off..")
    }

    override fun turnOn() {
        println("Turning On..")
    }
}



// Abstract class
abstract class Car1() {

    var colour: String = "Red"
    abstract fun start()
}

class Toyota: Car1() {


    override fun start() {
        println("Toyota car has started...")
    }
}











// Classes
class car() {

    private var fuelContent: Int = 20
    var colour: String = "Blue"

    fun startCar() {
        println("Car has started!")
    }

    private fun stopCar() {
        println("Car has stopped!")
    }

    fun addFuel(amount: Int) {
        this.fuelContent += amount
        println("Fuel content is now ${this.fuelContent}")
    }
}


open class Bird{
    fun fly() {
        println("Flying...")
    }
}



class Duck: Bird() {
    fun swim() {
        println("Swimming...")
    }

}


open class Employee(name: String, salary: Int) {

    init {
        println("Name is $name")
        println("Salary is $salary")
    }
}

class Programmer(name: String, type: String, salary: Int): Employee(name, salary) {

    init {
        println("Type of programmer is $type")
    }

    fun code() {
        println("Coding...")
    }
}






