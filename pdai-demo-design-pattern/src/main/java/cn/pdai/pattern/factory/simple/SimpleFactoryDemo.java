package cn.pdai.pattern.factory.simple;

import cn.hutool.core.lang.Console;
import cn.pdai.pattern.factory.simple.entity.Product;
import org.junit.Test;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 13:55
 */
public class SimpleFactoryDemo {

    @Test
    public  void main() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
        Console.log(product);
    }
}
