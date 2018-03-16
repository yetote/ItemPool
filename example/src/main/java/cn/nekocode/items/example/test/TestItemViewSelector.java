package cn.nekocode.items.example.test;

import cn.nekocode.items.ItemView;
import cn.nekocode.items.ItemViewSelector;
import cn.nekocode.items.SelectResult;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public class TestItemViewSelector implements ItemViewSelector<TestData> {


    interface ViewTypeOfData {
        // 自动把某个类型数据的所有 ViewType 给收集起来
        int TestItemViewA();
        int TestItemViewB();
    }

    public static class ViewTypes {
        public ViewTypeOfData getViewTypeOfData() {
            return new ViewTypeOfData() {

                @Override
                public int TestItemViewA() {
                    return 0;
                }

                @Override
                public int TestItemViewB() {
                    return 0;
                }
            };
        }
    }

    public int select(TestData data) {
        ViewTypeOfData viewTyps = new ViewTypes().getViewTypeOfData();
        return data.a ? viewTyps.TestItemViewA() : viewTyps.TestItemViewB();
    }
}
