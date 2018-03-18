package cn.nekocode.items.example.test;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.nekocode.items.GetDataFunction;
import cn.nekocode.items.ItemData;
import cn.nekocode.items.ItemEventHandler;
import cn.nekocode.items.ItemView;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public class _TestItemsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements TestItems {
    List<ItemData> list = new ArrayList<>();

//    private static final GetDataFunction<List> sDefault = new GetDataFunction<List>() {
//        @Override
//        public ItemData apply(List list, int position) {
//            return list.get(position);
//        }
//    };

    public static ItemData<TestData> TestData(TestData data) {
        return new _TestDataItemData(data, id.data.test_data);
    }

    public static void TestData2() {
        // 设置 dataType
    }

    static void toItemViewSelector() {
        // 生成 Selector
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    private ItemData getData(List<ItemData> list, int position) {
        return list.get(position);
    }

    @Override
    public int getItemViewType(int position) {
        ItemData data = getData(list, position); // 优化

        switch (data.dataType()) {
            case id.data.test_data: {
                return id.view.item_view_a;
            }

            case id.data.test_data_2: {
                final int viewType = data.selector().select(data.data());
                if (viewType > 0) { // todo
                    return viewType;
                }
                throw new RuntimeException("该 ");
            }
        }

        throw new RuntimeException("没有注册该 Data");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public List list() {
        return list;
    }

    @Override
    public ArrayList list2() {
        return null;
    }

    @Override
    public Map map(GetDataFunction<Map> getData) {
        return null;
    }

    @Override
    public RecyclerView.Adapter adapter() {
        return this;
    }

    @Override
    public ItemEventHandler handler() {
        return null;
    }

    public static final class id {
        public static final class data {
            public static final int test_data = 0x11000001;
            public static final int test_data_2 = 0x11000002;
        }

        public static final class view {
            public static final int item_view_a = 0x11000001;
            public static final int item_view_b = 0x11000002;
        }
    }
}
