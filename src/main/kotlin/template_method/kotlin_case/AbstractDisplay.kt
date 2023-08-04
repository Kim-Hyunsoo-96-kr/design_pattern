package template_method.kotlin_case

abstract class AbstractDisplay {
    abstract fun open();
    abstract fun close();
    abstract fun print();
    fun display() {
        open()
        for(i in 1..5) {
            print()
        }
        close()
    }
}