package cn.nekocode.items;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public final class SelectResult<T> {
    private int id;

    private SelectResult(int id) {
        this.id = id;
    }

    public int id() {
        return id;
    }
}
