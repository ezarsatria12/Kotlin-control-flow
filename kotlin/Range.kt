fun main() {
    val xp = 31;
    val bronze = 0..15
    val silver = 16..35
    if (xp in bronze){
        println("Your Rank Is Bronze")
    }else if(xp in silver){
        println("Your Rank Is Silver")
    }else {
        println("Get out now I don't need a cheater")
    }
}