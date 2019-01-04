fun main(args: Array<String>) {

    fun BarneyGirlsNumber(Hookers: Int,GoodGirls: Int): Int{
        return Hookers+GoodGirls
    }
    fun BarneyMood(Mood: String = "Horney"): String{
        return Mood
    }
    val Girls = BarneyGirlsNumber(56,30)
    println("Barney hooked up with $Girls girls")
    println("Barney is ${BarneyMood("In love")} with Robin")
}

