

fun main() {

    /*val obj1 = User("Bolu", 34)
    val obj2 = User("Bolu", 31)

    println(obj1.toString())
    println(obj1 == obj2)*/


    // Objects

    /*var result = ObjExample.b
    println(result)

    println(ObjExample.addAB())*/


    // Object Expression
    /*val person1 = object : Person() {
        override fun dance() {
            println("I don't dance")
        }


    }

    person1.dance()
    person1.eat()
    person1.talk()*/

    // Generics

    // With classes
    /*var ageInt: Person2<Int> = Person2(40)

    var ageString: Person2<String> = Person2("30")*/

    // With methods

    val stringList: List<String> = listOf("bottle", "car", "sun")

    val intList: List<Int> = listOf(2,3,5,7,11)

    printValue(stringList)
    //printValue(intList)
    intList.printValue2()

}


// Data Classes
data class User(val name: String, val age: Int)


object ObjExample {

    private var a: Int = 2
    var b: Int = 12

    fun addAB(): Int {
        return a + b
    }

    // body of class/object
}


// Object Expression

abstract class Person() {

    fun eat() = println("Eating food...")

    fun talk() = println("Talking with people...")

    abstract fun dance()
}


// Generics

/*class Person2( age: Int) {

    var age: Int = age

    init {
        this.age = age
        println(age)
    }

}*/


// Generics
class Person2<T>( age: T) {

    var age: T = age

    init {
        this.age = age
        println(age)
    }

}


fun <T> printValue(list: List<T>) {
    for (element in list) {
        println(element)
    }
}

// Extension function with Generics
fun <T>List<T>.printValue2() {
    for (element in this) {
        println(element)
    }
}
