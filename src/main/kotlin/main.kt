fun main (){
    val likes = 55
    val people = if (likes%10==1) "человеку." else "людям."
    println("Ваша запись понравилась $likes $people")
}