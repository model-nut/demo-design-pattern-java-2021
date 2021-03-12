package cn.pdai.pattern.factory.simple;

import cn.pdai.pattern.factory.simple.entity.ConcreteProduct;
import cn.pdai.pattern.factory.simple.entity.ConcreteProduct1;
import cn.pdai.pattern.factory.simple.entity.ConcreteProduct2;
import cn.pdai.pattern.factory.simple.entity.Product;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 14:06
 */
public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
}
