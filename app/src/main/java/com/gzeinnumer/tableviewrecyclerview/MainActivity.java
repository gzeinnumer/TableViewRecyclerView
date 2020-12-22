package com.gzeinnumer.tableviewrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

import com.gzeinnumer.tableviewrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initData();
    }

    private void initData() {
        List<MyModel> list = new ArrayList<>();
        for (int i=0; i<30; i++) {
            String name = UUID.randomUUID().toString();
            String address = UUID.randomUUID().toString();
            list.add(new MyModel(name, address));
        }

        initAdapter(list);
    }

    private void initAdapter(List<MyModel> list) {
        AdapterRV adapter = new AdapterRV();

        binding.rv.setAdapter(adapter);
        binding.rv.setHasFixedSize(true);
        binding.rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adapter.setItem(list);
    }
}