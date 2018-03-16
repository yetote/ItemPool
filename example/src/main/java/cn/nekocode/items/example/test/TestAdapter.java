package cn.nekocode.items.example.test;

import android.support.annotation.Keep;

import cn.nekocode.items.ItemView;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
@Keep
public interface TestAdapter {
    int viewA();
    int viewB();

    @Keep // 这里用来绑定对应的 Selector
    class Test {

    }
}
