fun main (){
    val likes = 11
    val people = if (likes % 10 == 1 && likes !== 11) "человеку." else "людям."
    println("Ваша запись понравилась $likes $people")
}