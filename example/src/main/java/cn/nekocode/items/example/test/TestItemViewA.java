package cn.nekocode.items.example.test;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.nekocode.items.ItemView;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public class TestItemViewA implements ItemView<TestData> {

    static int getViewType() {
        return 123; // 用户自己从 ViewTypes 里取
    }

    @NonNull
    @Override
    public View onCreateItemView(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return null;
    }

    @Override
    public void onBindData(@NonNull TestData data) {

    }
}
