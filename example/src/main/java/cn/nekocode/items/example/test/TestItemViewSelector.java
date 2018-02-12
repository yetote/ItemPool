package cn.nekocode.items.example.test;

import cn.nekocode.items.ItemView;
import cn.nekocode.items.ItemViewSelector;
import cn.nekocode.items.SelectResult;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public abstract class TestItemViewSelector implements ItemViewSelector<TestData> {

    abstract int TestItemViewA();
    abstract int TestItemViewB();

    public int select(TestData data) {
        return data.a ? TestItemViewA() : TestItemViewB();
    }
}
