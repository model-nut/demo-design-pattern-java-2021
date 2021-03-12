package cn.pdai.pattern.factory.abstractz.entity;

import cn.pdai.pattern.factory.abstractz.entity.AbstractProductA;
import cn.pdai.pattern.factory.abstractz.entity.AbstractProductB;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 14:15
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
