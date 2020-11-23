fun main(args: Array<String>) {
    //var name = "oussema"
    //name = "test"
    //val a = 5
    //println(name)
    //println(a)
    //printSum(5, 5)
    //println(returnSum(5, 5))

    //var name = "oussema"
    //var hello = "Hello"
    //val message = "$hello $name Welcome to the Workshop"
    //println(message)

    //var user = User("Oussema", 26)
    //println("${user.name} age = ${user.age}")
    //println(user)

    //val x : Any = 45

    //if(x is String){
    //    println(x)
    //} else if(x is Int){
    //   println(x * x)
    //}

    //printSum(10, 10) // 20
    //printSum(b = 29) // 29
    //printSum(a = 30) // 40
    //printSum() // 10


    //5.printSum(10)
    //10.printSum(49)
    // User@4554617c
    // User(name=Oussema, age=26)

    //"TESTER".removeUpperCase()

    //println(returnSum(5, 5))
/*
    val x = 10

    val ch = when(x){
        0 -> "ZERO"
        1 -> "ONE"
        else -> "OTHER"
    }

    println(ch)
    ch.removeUpperCase()
 */

    val numbers = mutableListOf(1, null, 2, null, 3, 4, 5, 6, 7, 8, 9)
        .filterNotNull()
        .filter { it % 2 == 0 }
        .sortedDescending()

    println(numbers)
}

fun returnSum(a: Int, b: Int) = a + b

fun Int.printSum(a: Int) {
    println(this + a)
}

fun String.removeUpperCase() {
    print(this.toLowerCase())
}
// How to declare functions
//fun printSum(a: Int = 0, b: Int = 10) {
//    println(a + b)
//}


