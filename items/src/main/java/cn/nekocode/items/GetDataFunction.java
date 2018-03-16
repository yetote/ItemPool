package cn.nekocode.items;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
@FunctionalInterface
public interface GetDataFunction<T> {
    ItemData apply(T t, int position);
}