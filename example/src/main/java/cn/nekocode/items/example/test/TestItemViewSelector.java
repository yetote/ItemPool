package cn.nekocode.items.example.test;

import cn.nekocode.items.ItemViewSelector;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public class TestItemViewSelector implements ItemViewSelector<TestData> {

    @Override
    public int select(TestData data, int dataType) {
        return TestItemViewA.getViewType();
    }
}
