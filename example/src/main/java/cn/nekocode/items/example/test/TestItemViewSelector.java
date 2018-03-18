package cn.nekocode.items.example.test;

import cn.nekocode.items.ItemView;
import cn.nekocode.items.ItemViewSelector;
import cn.nekocode.items.annotation.ItemViewSelectorAnnotation;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
@ItemViewSelectorAnnotation
public abstract class TestItemViewSelector implements ItemViewSelector<TestData2> {

    // 生成 id  todo 需要绑定对应的 View
    abstract int TestItemViewA();
    abstract int TestItemViewB();

    @Override
    public int select(TestData2 data) {
        return data.a ? TestItemViewA() : TestItemViewB();
    }
}
