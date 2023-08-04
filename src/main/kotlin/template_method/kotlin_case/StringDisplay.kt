package template_method.kotlin_case

class StringDisplay(private val string:String):AbstractDisplay() {
    private val width = string.length

    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$string|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for(i in 1..width) {
            print("-")
        }
        println("+")
    }
}