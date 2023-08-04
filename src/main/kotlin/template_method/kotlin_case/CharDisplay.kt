package template_method.kotlin_case

class CharDisplay(private val ch:Char):AbstractDisplay() {

    override fun open() {
        print("<<")
    }

    override fun close() {
        println(">>")
    }

    override fun print() {
        print(ch)
    }
}