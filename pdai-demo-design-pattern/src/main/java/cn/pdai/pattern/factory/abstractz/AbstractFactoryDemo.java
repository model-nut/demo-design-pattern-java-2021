package cn.pdai.pattern.factory.abstractz;

import cn.hutool.core.lang.Console;
import cn.pdai.pattern.factory.abstractz.entity.*;
import org.junit.Test;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 14:08
 */
public class AbstractFactoryDemo {

    @Test
    public void main() {
        // 对象家族
        AbstractFactory abstractFactory = new AbstractConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        Console.log("{} \n{}", productA, productB);

        abstractFactory = new AbstractConcreteFactory2();
        productA = abstractFactory.createProductA();
        productB = abstractFactory.createProductB();
        Console.log("{} \n{}", productA, productB);
    }
}
