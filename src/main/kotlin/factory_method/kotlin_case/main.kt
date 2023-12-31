package factory_method.kotlin_case

import factory_method.kotlin_case.idcard.IDCardFactory

fun main() {
    val factory = IDCardFactory()
    val card1 = factory.create("user1")
    val card2 = factory.create("user2")
    val card3 = factory.create("user3")
    card1.use()
    card2.use()
    card3.use()
}