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
        return data.selector().select(data.data(), 123 /* 返回 DataType */);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}