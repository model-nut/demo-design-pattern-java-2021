package cn.pdai.pattern.factory.method.entity;

import cn.pdai.pattern.factory.simple.entity.ConcreteProduct1;
import cn.pdai.pattern.factory.simple.entity.Product;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 14:09
 */
public class ConcreteFactory1 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}

