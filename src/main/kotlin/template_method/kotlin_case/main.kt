package template_method.kotlin_case

fun main() {
    val d1 = CharDisplay('H')
    val d2 = StringDisplay("Hello, world.")

    d1.display()
    d2.display()
}