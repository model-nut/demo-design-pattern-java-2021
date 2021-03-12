package cn.pdai.pattern.factory.method.entity;

import cn.pdai.pattern.factory.simple.entity.ConcreteProduct;
import cn.pdai.pattern.factory.simple.entity.Product;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 14:09
 */
public class ConcreteFactory extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
