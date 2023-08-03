package adaptor_pattern.kotlin_case

open class Banner(private val string:String) {
    fun showWithParen() {
        println("($string)")
    }
    fun showWithAster() {
        println("*$string*")
    }
}