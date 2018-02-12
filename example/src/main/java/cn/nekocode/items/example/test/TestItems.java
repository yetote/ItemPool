package cn.nekocode.items.example.test;

import android.support.v7.widget.RecyclerView;

import java.util.List;

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
        )
})
public abstract class TestItems {

    abstract List list();

    // Map map();

    abstract RecyclerView.Adapter adapter();

    // ListAdapter adapter2();


    void select(int position) {

    }
}
