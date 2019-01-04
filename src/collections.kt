fun main(args: Array<String>) {
    val BarneyGang = arrayListOf("Ted","Robin","Marshal","Lily","Barney")
    BarneyGang.remove("Barney")
    println("Barney has ${BarneyGang.size} gang members")
    val loveKids = hashMapOf("Ted" to "yes","Robin" to "no","Marshal" to "yes","Lily" to "yes")
    loveKids.put("Barney","no")
    println(loveKids.toSortedMap())
}