/*
 * Copyright 2018 nekocode (nekocode.cn@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.nekocode.items.annotation;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import cn.nekocode.items.ItemView;
import cn.nekocode.items.ItemViewSelector;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
@Retention(CLASS)
@Target(ANNOTATION_TYPE)
public @interface ItemBinding {

    Data data();
    Views views();

    @interface Data {
        Class value();
    }

    @interface Views {
        // 二选一
        Class<? extends ItemViewSelector> selector() default NoneSelector.class;
        Class<? extends ItemView> value() default NoneItemView.class;
    }

    class NoneSelector implements ItemViewSelector {

        @Override
        public int select(Object data) {
            return 0;
        }
    }

    class NoneItemView extends ItemView {

        @NonNull
        @Override
        public View onCreateItemView(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
            return null;
        }

        @Override
        public void onBindData(@NonNull Object data) {

        }
    }
}
