package cn.nekocode.items.example.test;

import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import cn.nekocode.items.GetDataFunction;
import cn.nekocode.items.ItemData;
import cn.nekocode.items.ItemEventHandler;
import cn.nekocode.items.annotation.ItemBinding;
import cn.nekocode.items.annotation.Items;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
@Items({
        @ItemBinding(
                data = @ItemBinding.Data(TestData.class),
                views = @ItemBinding.Views(value = {
                        TestItemViewA.class,
                        TestItemViewB.class,
                }, selector = TestItemViewSelector.class)
        ),
        @ItemBinding(
                data = @ItemBinding.Data(TestData.class),
                views = @ItemBinding.Views(value = {
                        TestItemViewB.class,
                })
        ),
})
public abstract class TestItems {

    static TestItems create() {
        return null;
    }


    abstract List list();
    abstract ArrayList list2();


    // 如果是自定义数据类型的话，需要定义 getData 方法
    abstract Map map(GetDataFunction<Map> getData);

    abstract RecyclerView.Adapter adapter();

    // ListAdapter adapter2();


    abstract ItemEventHandler handler();

}
