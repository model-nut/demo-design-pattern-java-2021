package cn.pdai.pattern.builder.entity;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 14:23
 */
public class StringBuilder extends AbstractStringBuilder {
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}
