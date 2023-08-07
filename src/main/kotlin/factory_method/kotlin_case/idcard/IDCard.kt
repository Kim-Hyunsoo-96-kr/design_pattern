package factory_method.kotlin_case.idcard

import factory_method.kotlin_case.framework.Product

class IDCard:Product {
    private var owner:String

    constructor(owner:String) {
        println(owner + "의 카드를 만듭니다.")
        this.owner = owner
    }

    override fun use() {
        println("${this}을 사용합니다.")
    }

    override fun toString(): String {
        return "[IDCard:$owner]"
    }

    fun getOwner():String{
        return owner
    }
}