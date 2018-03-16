package cn.nekocode.items;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public interface ItemData<T> {
    T data();
    int dataType();
    ItemViewSelector<T> selector();
}
