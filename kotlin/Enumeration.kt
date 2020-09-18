fun main() {
    val getPlayerLevel = (playerID.ezar.value)
    print("Player Level is $getPlayerLevel")
}

///Enumeration Class
enum class playerID( val value: Int){
    ezar(15),
    sat(16),
    ria(74)
}