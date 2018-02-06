package cn.nekocode.items;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public interface ItemView<T> {

    @NonNull
    View onCreateItemView(
            @NonNull LayoutInflater inflater,
            @NonNull ViewGroup parent);

    void onBindData(@NonNull final T data);
}
