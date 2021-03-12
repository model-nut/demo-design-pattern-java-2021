package cn.pdai.pattern.strategy;


import cn.pdai.pattern.strategy.entity.Duck;
import cn.pdai.pattern.strategy.entity.Quack;
import cn.pdai.pattern.strategy.entity.Squeak;
import org.junit.Test;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 13:55
 */
public class StrategyDemo {

    @Test
    public  void main() {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
