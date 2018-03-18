package cn.nekocode.items.example.test;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.nekocode.items.ItemView;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public class TestItemViewB extends ItemView<TestData2> {

    @NonNull
    @Override
    public View onCreateItemView(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return null;
    }

    @Override
    public void onBindData(@NonNull TestData2 data) {

    }
}
