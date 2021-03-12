package cn.pdai.pattern.builder;

import cn.pdai.pattern.builder.entity.StringBuilder;
import org.junit.Test;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 13:55
 */
public class BuilderDemo {

    @Test
    public void main() {
        // 封装一个对象的构造过程，并允许按步骤构造
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for (int i = 0; i < count; i++) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString()); // abcdefghijklmnopqrstuvwxyz
    }
}
