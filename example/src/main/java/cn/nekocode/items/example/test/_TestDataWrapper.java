package cn.nekocode.items.example.test;

import cn.nekocode.items.ItemData;
import cn.nekocode.items.ItemViewSelector;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public class _TestDataWrapper implements ItemData<TestData> {
    private ItemViewSelector<TestData> selector; // 和 adapter 生成到同一个目录下
    private TestData data;


    public _TestDataWrapper(TestData data, ItemViewSelector<TestData> selector) {
        this.data = data;
        this.selector = selector;
    }

    public _TestDataWrapper(TestData data) {
        this.data = data;
        this.selector = new ItemViewSelector<TestData>() {
            @Override
            public int select(TestData data, int viewType) {
                return 123; // 直接返回配置好的 ViewType
            }
        };
    }

    @Override
    public TestData data() {
        return data;
    }

    @Override
    public int dataType() {
        return 123; // 返回 dataType
    }

    @Override
    public ItemViewSelector<TestData> selector() {
        return selector;
    }
}
