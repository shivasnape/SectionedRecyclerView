package com.example.glaube_nikesh.sectionedrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.glaube_nikesh.sectionedrecyclerview.adapter.RecyclerViewSectionAdapter;
import com.example.glaube_nikesh.sectionedrecyclerview.model.DataModel;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Shivichu on 7/11/2017.
 */

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    List<DataModel> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        dataList = new ArrayList<DataModel>();
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Section RecyclerView");

        }

       initView();

        RecyclerView my_recycler_view = (RecyclerView) findViewById(R.id.my_recycler_view);
        RecyclerViewSectionAdapter adapter = new RecyclerViewSectionAdapter(dataList);
        GridLayoutManager manager = new GridLayoutManager(this, getResources().getInteger(R.integer.grid_span_1));

        my_recycler_view.setLayoutManager(manager);
        adapter.setLayoutManager(manager);
        my_recycler_view.setAdapter(adapter);


    }

    private void initView() {

        for (int i = 1; i <= 10; i++) {

            DataModel dm = new DataModel();

            dm.setHeaderTitle("Section " + i);

            ArrayList<String> singleItem = new ArrayList<>();
            for (int j = 1; j <= 5; j++) {

                singleItem.add("Item " + j);
            }

            dm.setAllItemsInSection(singleItem);

            dataList.add(dm);

        }
    }
}
