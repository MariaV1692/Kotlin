import kotlin.random.Random

fun main(args: Array<String>) {
    val Hookers = Random.nextInt(1,150)
    val GoodGirls = Random.nextInt(1,150)

    fun BarneyMood(GirlsNumbers: Int){
        when(GirlsNumbers){
            in 0..100 -> println("I'm sad because I've slept with only $GirlsNumbers girls")
            in 101..199 -> println("I'm on my $GirlsNumbers girls. Few more to go")
            else -> println("I'm awesome")
        }
    }
    BarneyMood(BarneyGirlsNumber(Hookers,GoodGirls))
}

fun BarneyGirlsNumber(Hookers: Int,GoodGirls: Int): Int{
    println("Barney slept with $Hookers hookers and $GoodGirls good girls")
    return Hookers+GoodGirls
}

