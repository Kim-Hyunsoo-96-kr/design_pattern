package adaptor_pattern.kotlin_case

class PrintBanner(private val string:String):Banner(string), Print {
    override fun printWeak() {
        showWithParen()
    }
    override fun printStrong() {
        showWithAster()
    }
}