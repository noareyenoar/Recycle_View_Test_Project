package com.porducer.recycle_view_test_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private static int data_number = 25;
    protected String[] data_set;
    protected int[] logo_set;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cn_adapter_connector.create_dataset(getApplicationContext());
        data_set = cn_adapter_connector.getData_set();
        logo_set = cn_adapter_connector.getLogo_set();

        recyclerView = (RecyclerView) findViewById(R.id.cn_recycleview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new cn_adapter(data_set,logo_set);
        recyclerView.setAdapter(mAdapter);
    }

}
