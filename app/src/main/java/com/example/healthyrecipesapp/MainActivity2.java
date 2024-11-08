package com.example.healthyrecipesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private ListView listView;
    private Spinner spinner;
    private Button search;
    List<Cook> c;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.listview);
        spinner = findViewById(R.id.spinner);
        search = findViewById(R.id.search);


        search.setOnClickListener(v -> {
            String selectedItem = spinner.getSelectedItem().toString();
            Data d = new Data();
            c = d.getCook(selectedItem);
            List<String> info = new ArrayList<>();


            for(Cook cook : c){
                info.add(cook.getName()+ " ");
            }

            adapter = new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_list_item_1, info);
            listView.setAdapter(adapter);
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity2.this, MainActivity3.class);

                Cook cook = c.get(position);
                i.putExtra("photo", cook.getPhoto());
                i.putExtra("ing", cook.getIngredients());
                i.putExtra("method", cook.getMethod());

                startActivity(i);
            }
        });
    }
}