/*
 * Copyright 2016 nekocode (nekocode.cn@gmail.com)
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
package cn.nekocode.items;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public final class ItemPool extends ArrayList<Object> {
    private static final AtomicInteger ID_COUNTER = new AtomicInteger(0);

    private final HashMap<Class, ItemType> mapOfType = new HashMap<>();
    private final HashMap<Class<? extends ItemView>, Class> mapOfDataClass = new HashMap<>();
    private final SparseArray<Class<? extends ItemView>> mapOfItemClass = new SparseArray<>();
    private final ItemAdapter internalAdapter = new ItemAdapter(this);


    public void addType(@NonNull Class<? extends ItemView> itemClass) {
        final ParameterizedType parameterizedType = (ParameterizedType) itemClass.getGenericSuperclass();
        final Class dataClass = (Class) parameterizedType.getActualTypeArguments()[0];

        final ItemType type = new ItemType(itemClass);
        mapOfType.put(dataClass, type);
        mapOfDataClass.put(itemClass, dataClass);
        mapOfItemClass.put(type.getTypeId(), itemClass);
    }

    @NonNull
    public RecyclerView.Adapter<RecyclerView.ViewHolder> getAdapter() {
        return internalAdapter;
    }

    public void notifyDataSetChanged() {
        internalAdapter.notifyDataSetChanged();
    }

    public void notifyItemChanged(int position) {
        internalAdapter.notifyItemRangeChanged(position, 1);
    }

    public void notifyItemRangeChanged(int positionStart, int itemCount) {
        internalAdapter.notifyItemRangeChanged(positionStart, itemCount);
    }

    public void notifyItemInserted(int position) {
        internalAdapter.notifyItemRangeInserted(position, 1);
    }

    public void notifyItemMoved(int fromPosition, int toPosition) {
        internalAdapter.notifyItemMoved(fromPosition, toPosition);
    }

    public void notifyItemRangeInserted(int positionStart, int itemCount) {
        internalAdapter.notifyItemRangeInserted(positionStart, itemCount);
    }

    public void notifyItemRemoved(int position) {
        internalAdapter.notifyItemRangeRemoved(position, 1);
    }

    public void notifyItemRangeRemoved(int positionStart, int itemCount) {
        internalAdapter.notifyItemRangeRemoved(positionStart, itemCount);
    }


    int getItemType(int index) {
        final Class dataClass = get(index).getClass();
        final ItemType type = mapOfType.get(dataClass);
        if (type == null) {
            throw new RuntimeException("Unregistered data type: " + dataClass.getSimpleName());
        }
        return type.getTypeId();
    }

    Class<? extends ItemView> getItemClass(int typeId) {
        return mapOfItemClass.get(typeId);
    }

    ItemType getItemType(Class<? extends ItemView> itemClass) {
        final Class dataClass = mapOfDataClass.get(itemClass);
        return mapOfType.get(dataClass);
    }

    static class ItemType {
        private final int typeId;
        private final Class<? extends ItemView> itemClass;
        private ItemEventHandler handler;

        private ItemType(Class<? extends ItemView> itemClass) {
            typeId = ID_COUNTER.getAndIncrement();
            this.itemClass = itemClass;
        }

        public int getTypeId() {
            return typeId;
        }

        public Class<? extends ItemView> getItemClass() {
            return itemClass;
        }
    }
}
