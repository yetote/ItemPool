package cn.nekocode.items.example.test;

import cn.nekocode.items.ItemData;
import cn.nekocode.items.ItemViewSelector;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public class _TestDataWrapper implements ItemData<TestData> {
    private TestItemViewSelector selector; // 和 adapter 生成到同一个目录下
    private TestData data;


    public _TestDataWrapper(TestItemViewSelector selector, TestData data) {
        this.selector = selector;
        this.data = data;
    }

    @Override
    public TestData data() {
        return data;
    }

    @Override
    public ItemViewSelector selector() {
        return selector;
    }
}
