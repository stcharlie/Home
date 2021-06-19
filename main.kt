fun main() {
   println(printProgram())


    val str :String = "good food"
    val reverse : String = reverseWord(str)
    println(reverse)

}

fun printProgram(){
    for (x in 1 ..100){
        if(x % (3*5) == 0){
            println("FizzBuzz")
        }else if(x % 5 == 0){
            println("Buzz")
        }else if(x % 3 == 0){
            println("Fizz")
        }else{
            println(x)
        }
    }
}

fun reverseWord(str: String): String {
    var reverse = ""
    for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }
    return reverse
}


