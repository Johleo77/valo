fun checkSpeed(speed : Int , limit : Int = 60) {
    if(speed > limit){
        var exceed = speed - limit
        println("Exceeds the limit by $exceed kilometers per hour")
    }
}

fun main() {
    checkSpeed(100, 60)
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}