package cn.nekocode.items.example;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import cn.nekocode.items.ItemPool;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        assert recyclerView != null;

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final ItemPool itemPool = new ItemPool();
        itemPool.addType(HeaderItem.class);
        itemPool.addType(TextItem.class);

        itemPool.add(new Header());
        itemPool.add("A");
        itemPool.add("B");
        itemPool.add("C");
        itemPool.add("D");
        itemPool.add("E");
        itemPool.add("F");
        itemPool.add("G");

        recyclerView.setAdapter(itemPool.getAdapter());
    }
}
