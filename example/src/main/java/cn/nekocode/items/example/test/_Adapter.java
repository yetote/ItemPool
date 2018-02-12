package cn.nekocode.items.example.test;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cn.nekocode.items.ItemData;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public class _Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<ItemData> list = new ArrayList<>();
    TestItemViewSelector selector = new TestItemViewSelector();


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        ItemData data = list.get(position);
        return data.selector().select(data.data());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
