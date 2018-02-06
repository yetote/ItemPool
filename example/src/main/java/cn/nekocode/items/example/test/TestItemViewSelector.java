package cn.nekocode.items.example.test;

import cn.nekocode.items.ItemView;
import cn.nekocode.items.ItemViewSelector;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public class TestItemViewSelector implements ItemViewSelector<TestData> {

    @Override
    public Class<? extends ItemView<TestData>> select(TestData data) {
        return data.a ? TestItemViewA.class : TestItemViewB.class;
    }
}
