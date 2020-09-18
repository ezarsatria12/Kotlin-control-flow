import java.util.*

//get time now
val cal = Calendar.getInstance()
public val jam = cal.get(Calendar.HOUR_OF_DAY)

//main program
fun main() {
    //Statment
    val timeCloudXStart : Int = 7
    val timeCloudXFinish : Int = 9
    print("Sekarang Pukul $jam Jadi " )

    //Expressions
    val cloudx = if (jam < timeCloudXStart && jam < timeCloudXFinish) {
        "CloudX sedang berlangsung"
    }else "Tidak Dalam Jam CloudX sekarang"
    print(cloudx)
}