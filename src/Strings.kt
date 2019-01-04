fun main(args: Array<String>) {
    /*Declaration of first variable*/
    val starWarsQuote: String = "May the force be with you"
    println(starWarsQuote)
    println("""|Quanta QSMC

            |Tech-Front (Shanghai) Computer Co., Ltd

            |No. 2, Lane 58, Sanzhuang Road, Songjiang

    |Export Processing Zone

    |Shanghai, 201613, China""".trimMargin("|"))

    /*Check if string is what it should be*/
    if(starWarsQuote === "May the force be with you"){
        println("Is good!")
    }else{
        println("Is bad!")
    }

    if(starWarsQuote.contains("force")){
        println("Contains force")
    }else{
        println("Not contains force")
    }

    val name: String = "Maria"
    val age: Int = 26
    val profession: String = "Medical Engineer"

    println("my name is $name and the length of my name is: ${name.length}\nIm $age years old and my profession is: $profession ")


}