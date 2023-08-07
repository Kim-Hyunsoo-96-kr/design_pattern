package factory_method.kotlin_case.idcard

import factory_method.kotlin_case.framework.Factory
import factory_method.kotlin_case.framework.Product

class IDCardFactory:Factory() {
    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        println("${product}을 등록했습니다.")
    }
}