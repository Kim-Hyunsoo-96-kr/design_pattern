package factory_method.java_case.idcard;

import factory_method.java_case.framwork.Factory;
import factory_method.java_case.framwork.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
