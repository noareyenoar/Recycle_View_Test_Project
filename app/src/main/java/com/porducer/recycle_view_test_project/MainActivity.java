package com.porducer.recycle_view_test_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private static int data_number = 25;
    protected String[] data_set;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create_dataset();

        recyclerView = (RecyclerView) findViewById(R.id.cn_recycleview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new cn_adapter(data_set);
        recyclerView.setAdapter(mAdapter);
    }
    public void create_dataset(){
        data_set = new String[data_number];
        for(int i=0 ; i<data_number ; i=i+1) {
            data_set[i] = "Example Row =" + i;
        }
    }
}
