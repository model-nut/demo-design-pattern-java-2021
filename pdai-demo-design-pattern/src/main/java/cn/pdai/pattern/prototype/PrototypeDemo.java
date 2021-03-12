package cn.pdai.pattern.prototype;


import cn.pdai.pattern.prototype.entity.ConcretePrototype;
import cn.pdai.pattern.prototype.entity.Prototype;
import org.junit.Test;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 13:55
 */
public class PrototypeDemo {

    @Test
    public void main() {
        // 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
    }
}
