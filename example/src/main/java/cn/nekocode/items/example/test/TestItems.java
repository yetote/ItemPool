package cn.nekocode.items.example.test;

import cn.nekocode.items.annotation.ItemBinding;
import cn.nekocode.items.Items;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
@ItemBinding(
        data = @ItemBinding.Data(TestData.class),
        views = @ItemBinding.Views(TestItemView.class)
)
public interface TestItems extends Items {
}
