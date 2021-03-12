package cn.pdai.pattern.prototype.entity;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 14:27
 */
public class ConcretePrototype extends Prototype {

    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    public Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
