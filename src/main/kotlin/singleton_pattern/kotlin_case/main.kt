package singleton_pattern.kotlin_case

fun main() {
    println("Start.")
    val obj1 = Singleton
    val obj2 = Singleton
    if(obj1 == obj2) {
        println("obj1과 obj2는 같은 인스턴스입니다.")
    } else {
        println("obj1과 obj2는 다른 인스턴스입니다.")
    }
    println("End.")
}